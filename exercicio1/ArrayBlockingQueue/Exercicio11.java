/*
 * Carlos Alexandre Peron dos Santos
 *
 * Implemente uma versão do problema do produtor/consumidor com M produtores e N consumidores usando ArrayBlockingQueue
 */
package ArrayBlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;

public class Exercicio11 {

    public static void main(String[] args) {
        int quantosProdutoresConsumidores = 10;
        int tamanho = 5;
        ArrayBlockingQueue array = new ArrayBlockingQueue(tamanho);
        
        for(int i=0; i<quantosProdutoresConsumidores; i++){
            Thread t = new Thread(new Produtor(array));
            Thread t2 = new Thread(new Consumidor(array));
            t.start();
            t2.start();
        }
    }
    
}
