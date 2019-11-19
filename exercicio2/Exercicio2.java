/*
 * Carlos Alexandre Peron dos Santos
 *
 * Implemente o problema do produtor/consumidor para uma estrutura com os seguintes campos:
 * número, simbolo, naipe, que representa uma carta de baralho.
 * A implementação deve possibilitar que após 10 cartas produzidas por dois produtores,
 * outros dois consumidores pegarão somente as maiores cartas.
 * Os produtores somente devem produzir mais cartas após os consumidores removerem 3 cartas cada um.
 * As cartas remanescentes podem continuar na estrutura.
 * Use a ordenação do baralho da menor para maior: A, 2, ..., 10, Q, J, K.
 */

package exercicio2;

import java.util.concurrent.ArrayBlockingQueue;

public class Exercicio2 {

    public static void main(String[] args) {
        ArrayBlockingQueue array = new ArrayBlockingQueue(10);
        Thread t;
        
        t = new Thread(new Produtor(array));
        t.start();
        t = new Thread(new Produtor(array));
        t.start();
        
        t = new Thread(new Consumidor(array));
        t.start();
        t = new Thread(new Consumidor(array));
        t.start();
    }
}
