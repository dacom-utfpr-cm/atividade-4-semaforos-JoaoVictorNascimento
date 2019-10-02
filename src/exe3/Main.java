package exe3;
/*
    Autor: João Victor Nascimento
    RA: 1817442
    Descrição: Garantir acesso exclusivo à seção crítica.
               Faça um código que possibilite que 2 ou mais threads realizem o incremento de um contador.
               Faça aexclusão mútua com semáforo.
*/
import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1);
        MutexCounter mutexcounter = new MutexCounter(semaphore);
        new Thread(new IncrementsThreads(mutexcounter, 3000), "Athos").start();
        new Thread(new IncrementsThreads(mutexcounter, 1000), "Porthos").start();
        new Thread(new IncrementsThreads(mutexcounter, 2000), "Aramis").start();
    }
}
