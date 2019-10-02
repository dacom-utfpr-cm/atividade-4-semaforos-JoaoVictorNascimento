package exe4;
/*
    Autor: João Victor Nascimento
    RA: 1817442
    Descrição: Garantir acesso à seção crítica para no máximo N threads.
               Faça um código que possibilite que N threads estejam na seção crítica simultaneamente.
*/
import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        Integer qnt_threads = 3;
        Semaphore semaphore = new Semaphore(qnt_threads);

        new Thread(new NThread(semaphore)).start();
        new Thread(new NThread(semaphore)).start();
        new Thread(new NThread(semaphore)).start();
        new Thread(new NThread(semaphore)).start();
        new Thread(new NThread(semaphore)).start();
        new Thread(new NThread(semaphore)).start();
        new Thread(new NThread(semaphore)).start();
        new Thread(new NThread(semaphore)).start();
    }
}
