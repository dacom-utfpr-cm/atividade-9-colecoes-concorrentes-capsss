package LinkedBlockingQueue;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Consumidor implements Runnable{
    LinkedBlockingQueue<Integer> linked;
    
    public Consumidor(LinkedBlockingQueue<Integer> array){
        this.linked = array;
    }

    @Override
    public void run() {
        try {
            System.out.println("consumido: " + linked.take());
        } catch (InterruptedException ex) {
            Logger.getLogger(Consumidor.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
    
}
