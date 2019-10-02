/*
    Autor: João Victor Nascimento
    RA: 1817442
    Descrição: Enviar sinal para outra thread para indicar que um evento ocorreu.
               Faça um código que uma thread t1 e t2 são inicializadas simultaneamente,
               mas a t2 pode somente continuar a execução após a sinalização de t1.
 */

package exe1;
import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1);
        new Thread(new SignalingThread("sendSinal",semaphore)).start();
        new Thread(new SignalingThread("",semaphore)).start();
    }

}
