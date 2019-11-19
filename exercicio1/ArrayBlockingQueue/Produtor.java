package ArrayBlockingQueue;

import java.util.Arrays;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Produtor implements Runnable{
    ArrayBlockingQueue array;
    
    public Produtor(ArrayBlockingQueue array){
        this.array = array;
    }

    @Override
    public void run() {
        try {
            System.out.println("produzindo: " + Thread.currentThread().getId());
            array.put(Thread.currentThread().getId());
        } catch (InterruptedException ex) {
            Logger.getLogger(Produtor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
