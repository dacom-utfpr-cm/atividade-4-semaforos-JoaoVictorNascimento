package exe5;
import java.util.concurrent.Semaphore;

public class BarrierThread {
    private Semaphore semaphore;
    private Integer MaxCapacity;

    public BarrierThread(Integer MaxCapacity){
        this.semaphore = new Semaphore(MaxCapacity - 1);
        this.MaxCapacity = MaxCapacity;
    }

    public void goToBarrier() throws InterruptedException {
        System.out.println("Thread: " + Thread.currentThread().getName() + " Running to the barrier...");
        Thread.sleep(2000);
        System.out.println("Thread: " + Thread.currentThread().getName() + " Ouch!... hit the barrier and fell to the ground...");
        semaphore.release();
        semaphore.acquire();
        semaphore.release(MaxCapacity);
        System.out.println("Thread: " + Thread.currentThread().getName() + " Picking up teeth that fell to the ground and getting ready to run to the barrier...");
    }
}
