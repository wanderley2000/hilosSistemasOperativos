package hilos.ejercicio7_produciryconsumirarray;
import hilos.ejercicio7_produciryconsumirarray.Intermediario;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Consumidor extends Thread{
    
    private Intermediario intermediario;
    
    public Consumidor (Intermediario a){
        this.intermediario = a;
    }
    public void run() {
        while (true) {
            try {
                char x = this.intermediario.consumir();
                System.out.println("Recogido el caracter " + x + " del intermediario");

                sleep((int) (Math.random() * 4000));
            } catch (InterruptedException ex) {
                Logger.getLogger(Consumidor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
