package exe2;

import java.util.concurrent.Semaphore;
public class RendezvousThread implements  Runnable {
    private int type;
    private Semaphore semaphore1;
    private Semaphore semaphore2;

    public RendezvousThread(int type, Semaphore semaphore1, Semaphore semaphore2){
        this.type = type;
        this.semaphore1 = semaphore1;
        this.semaphore2 = semaphore2;
    }

    @Override
    public void run(){
        if(type == 1){
            try {
                System.out.println("Trecho 1.1...");
                semaphore1.release();
                semaphore2.acquire();

                System.out.println("Trecho 1.2...");
                semaphore1.release();
                semaphore2.release();
            }
            catch (InterruptedException error){
                error.printStackTrace();
            }
        }
        else if(type == 2) {
            try {
                System.out.println("Trecho 2.1...");
                semaphore2.release();

                semaphore1.acquire();
                System.out.println("Trecho 2.2...");
                semaphore1.release();
            }
            catch (InterruptedException error){
                error.printStackTrace();
            }
        }
    }
}
