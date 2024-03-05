package hilos.ejercicio7_produciryconsumirarray;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Intermediario {
    
    private char[] intermediario;
    private int siguiente;
    private boolean estaVacia;
    private boolean estaLlena;
    
    public Intermediario (int tamanio){
        this.intermediario = new char[tamanio];
        this.siguiente = 0;
        this.estaVacia = true;
        this.estaLlena = false;
    }
    public synchronized char consumir(){
        while(this.estaVacia){
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Consumidor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        siguiente--; //le quito 1 para desplazarme dentro del consumo.
        this.estaLlena = false;
        if(siguiente == 0){
            this.estaVacia = true;
        }
        notifyAll();
        return this.intermediario[this.siguiente];
    }
    public synchronized void producir(char x){
        while(this.estaLlena){
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Consumidor.class.getName()).log(Level.SEVERE, null, ex);
            }           

        intermediario[siguiente] = x;
        siguiente++;
        this.estaVacia = false;
        if(siguiente == this.intermediario.length){
            this.estaLlena = true;
        }
        notifyAll();//todos los que estan esperando pueden continuar consumiendo.
    }
}
}
