package exe1;


import java.util.concurrent.Semaphore;

public class SignalingThread implements  Runnable{
    private String mode;
    private Semaphore semaphore;

    public SignalingThread(String mode, Semaphore semaphore){
        this.mode = mode;
        this.semaphore = semaphore;
    }

    @Override
    public void run(){
        try{
            semaphore.acquire();
            if(mode == "sendSinal"){
                System.out.println("Thread Started...");
                Thread.sleep(2000);
            } else {
                System.out.println("Thread Waiting Started...");
            }
        }catch (InterruptedException error) {
            error.printStackTrace();
        }
        if(mode == "sendSinal"){
            semaphore.release();
        }
        System.out.println("Thread Finished...");
    }
}
