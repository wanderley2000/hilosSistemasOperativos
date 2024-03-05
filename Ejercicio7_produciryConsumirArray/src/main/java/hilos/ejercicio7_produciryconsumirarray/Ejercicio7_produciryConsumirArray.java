
package hilos.ejercicio7_produciryconsumirarray;

public class Ejercicio7_produciryConsumirArray {

    public static void main(String[] args) {
        Intermediario b = new Intermediario(10);
        Productor x = new Productor(b);
        Consumidor y = new Consumidor(b);
        
        x.start();
        y.start();
    }
}