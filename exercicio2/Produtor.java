package exercicio2;

import java.util.Random;
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
            Random r = new Random();
            while(true){
                int valor = r.nextInt(13) + 1;
                array.put(Thread.currentThread().getId());
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Produtor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
