package hilos.ejercicio7_produciryconsumirarray;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Productor extends Thread {
    private Intermediario intermediario;
    private final String letras = "abcdefghijklmnopqrstuvwxyz";
    
    public Productor (Intermediario a){
        this.intermediario = a;
    }
    public void run(){
        while(true){
            char x = letras.charAt((int) (Math.random()* letras.length()));//aqui escoge un caracter en aleatorio
            intermediario.producir(x);//le indica al intermediario que lo puede producir.
            System.out.println("Depositado el caracter: " + x +" del intermediario");
            
            try {
                sleep((int) Math.random()*4000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Productor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
