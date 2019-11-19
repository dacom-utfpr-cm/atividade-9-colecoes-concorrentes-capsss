/*
 * Carlos Alexandre Peron dos Santos
 *
 * Implemente uma versão do problema do produtor/consumidor com M produtores e N consumidores usando LinkedBlockingQueue
 */

package LinkedBlockingQueue;

import java.util.concurrent.LinkedBlockingQueue;

public class Exercicio12 {

    public static void main(String[] args) {
        int quantosProdutoresConsumidores = 10;
        LinkedBlockingQueue<Integer> linked = new LinkedBlockingQueue<>();
        
        for(int i=0; i<quantosProdutoresConsumidores; i++){
            Thread t = new Thread(new Produtor(linked));
            Thread t2 = new Thread(new Consumidor(linked));
            t.start();
            t2.start();
        }
    }
    
}
