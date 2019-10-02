package exe4;
import java.util.concurrent.Semaphore;
public class NThread implements  Runnable {

    private Semaphore semaphore;

    public NThread(Semaphore semaphore){
        this.semaphore = semaphore;
    }

    @Override
    public void run(){
        try {
            while (true){
                semaphore.acquire();
                System.out.println("Get Coin...");
                System.out.println(semaphore.availablePermits());
                semaphore.release();
            }
        } catch (InterruptedException error){
            error.printStackTrace();
        }
    }
}
