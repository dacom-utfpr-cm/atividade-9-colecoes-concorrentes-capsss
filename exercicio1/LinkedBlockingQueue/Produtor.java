package LinkedBlockingQueue;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Produtor implements Runnable{
    LinkedBlockingQueue<Integer> linked;
    
    public Produtor(LinkedBlockingQueue<Integer> array){
        this.linked = array;
    }

    @Override
    public void run() {
        try {
            System.out.println("produzindo: " + Thread.currentThread().getId());
            linked.put((int) Thread.currentThread().getId());
        } catch (InterruptedException ex) {
            Logger.getLogger(Produtor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}