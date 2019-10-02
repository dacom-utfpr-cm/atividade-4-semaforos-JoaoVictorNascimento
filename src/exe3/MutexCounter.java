package exe3;
import java.util.concurrent.Semaphore;

public class MutexCounter {
    private Semaphore semaphore;
    private Integer counter = 0;

    public MutexCounter(Semaphore semaphore){
        this.semaphore = semaphore;
    }

    public void increment() throws InterruptedException{
        semaphore.acquire();
        System.out.println("Update Value for: " + counter);
        counter++;
        semaphore.release();
    }
}
