
package hilos.ejercicio_6;

import hilos.ejercicio_6.Counter;

public class HiloCounter extends Thread{
    private int id;
    private Counter counter;
    private int n;

    public HiloCounter(int id, int n, Counter counter) {
        this.id = id;
        this.counter = counter;
        this.n = n;
    }

    public void run(){
        if(this.counter.isSincronizado()){
            this.counter.mostrarNumeroSincronizado(id, n);
        }else{
            this.counter.mostrarNumerosNoSincronizado(id, n);
        }
    }
    

}
