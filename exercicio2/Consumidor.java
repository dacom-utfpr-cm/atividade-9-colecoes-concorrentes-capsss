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
                if(array.size() == 10){                    
                    Carta carta;
                    
                    carta = (Carta) array.take();
                    System.out.println("thread " + Thread.currentThread().getId() + " consumiu: " + carta.simbolo + " de " + carta.naipe);
                    carta = (Carta) array.take();
                    System.out.println("thread " + Thread.currentThread().getId() + " consumiu: " + carta.simbolo + " de " + carta.naipe);
                    carta = (Carta) array.take();
                    System.out.println("thread " + Thread.currentThread().getId() + " consumiu: " + carta.simbolo + " de " + carta.naipe);
                    
                    Thread.sleep(1000);
                }
                
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Consumidor.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
    
}
