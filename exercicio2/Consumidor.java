package exercicio2;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Consumidor implements Runnable{
    ArrayBlockingQueue array;
    
    public Consumidor(ArrayBlockingQueue array){
        this.array = array;
    }

    @Override
    public void run() {
        try {
            while(true){
                System.out.println("consumido: " + array.take());
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Consumidor.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
    
}
