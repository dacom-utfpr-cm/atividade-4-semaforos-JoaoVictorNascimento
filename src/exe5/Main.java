package exe5;
/*
    Autor: João Victor Nascimento
    RA: 1817442
    Descrição: Após n threads sincronizarem em um ponto em comum, um trecho específico (ponto crítico) pode ser executado por cada uma delas.
               Faça um código que possibilite barrar N threads em um ponto específico de execução e, após todas alcançarem o ponto, todas devem executar o trecho de código após esse ponto.
*/

public class Main {
    public static void main(String[] args) {
        Integer numberThreads = 5;
        BarrierThread barrier = new BarrierThread(numberThreads);

        for(Integer i=0; i< numberThreads; i++){
            new Thread(() ->{
                try {
                    barrier.goToBarrier();
                } catch (InterruptedException error) {
                    error.printStackTrace();
                }
            },Integer.toString(i)).start();
        }
    }
}
