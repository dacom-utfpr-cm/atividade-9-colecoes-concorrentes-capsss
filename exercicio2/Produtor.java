package exercicio2;

import java.util.Arrays;
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
                if(array.size() < 10){
                    Integer valor = r.nextInt(13) + 1;
                    int numeroNaipe = r.nextInt(4);
                    String simbolo = null, naipe = null;
                    if(valor == 1){
                        simbolo = "A";
                    }
                    if(valor == 11){
                        simbolo = "Q";
                    }
                    if(valor == 12){
                        simbolo = "J";
                    }
                    if(valor == 13){
                        simbolo = "K";
                    }
                    if(simbolo == null){
                        simbolo = valor.toString();
                    }

                    if(numeroNaipe == 0){
                        naipe = "Ouro";
                    }
                    if(numeroNaipe == 1){
                        naipe = "Espada";
                    }
                    if(numeroNaipe == 2){
                        naipe = "Copas";
                    }
                    if(numeroNaipe == 3){
                        naipe = "Paus";
                    }

                    Carta carta = new Carta(valor, simbolo, naipe);
                    array.put(carta);
                    System.out.println("thread " + Thread.currentThread().getId() + " produziu: " + simbolo + " de " + naipe);
                    Thread.sleep(1000);
                    
                }
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Produtor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
