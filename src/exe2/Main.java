/*
    Autor: João Victor Nascimento
    RA: 1817442
    Descrição: Enviar sinalização para um ponto de encontro entre threads.
               Faça um código que uma thread t1 e t2 são inicializadas e t1 espera por t2 e vice-versa.
               Exemplo:
                    t1:
                        trecho 1.1
                        trecho 1.2
                    t2:
                        trecho 2.1
                        trecho 2.2
               trecho 1.1 ocorre antes trecho 2.2 e trecho 2.1 ocorre antes de trecho 1.2.
 */
package exe2;
import java.util.concurrent.Semaphore;


public class Main {
    public static void main(String[] args) {
        Semaphore semaphore1 = new Semaphore(0);
        Semaphore semaphore2 = new Semaphore(1);
        new Thread(new RendezvousThread(1, semaphore1,semaphore2)).start();
        new Thread(new RendezvousThread(2, semaphore1,semaphore2)).start();
    }
}
