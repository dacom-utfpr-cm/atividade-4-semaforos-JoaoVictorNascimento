package exe3;

public class IncrementsThreads implements Runnable {
    private MutexCounter counter;
    private Integer timeSleep;

    public IncrementsThreads(MutexCounter counter, Integer timeSleep){
        this.counter = counter;
        this.timeSleep = timeSleep;
    }

    @Override
    public void run(){
        try {
            while (true){
                Thread.sleep(timeSleep);
                counter.increment();
                System.out.println("Thread: " + Thread.currentThread().getName() + " implemented");
            }
        } catch (InterruptedException error){
            error.printStackTrace();
        }
    }
}
