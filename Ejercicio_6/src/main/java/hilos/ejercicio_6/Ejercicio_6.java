package hilos.ejercicio_6;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Ejercicio_6 {

    public static void main(String[] args) {
       try {
        boolean sincronizado = true;
        Counter counter = new Counter(sincronizado);
        
        HiloCounter h1 = new HiloCounter(1, 5, counter);
        HiloCounter h2 = new HiloCounter(2, 15, counter);
        
        h1.start();
        h2.start();

            h1.join();
            h2.join();
            System.out.println("Fin del programa");
        } catch (InterruptedException ex) {
            Logger.getLogger(Ejercicio_6.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}