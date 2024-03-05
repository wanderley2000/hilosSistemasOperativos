package CarreraDeCaballos;

import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Caballo extends Observable implements Runnable {
//Se declaran atributos de la clase
    private String nombre;
//Creamos el constructor.
    public Caballo(String nombre) {
        this.nombre = nombre;
    }
//Obtengo el nombre del caballo
    public String getNombre() {
        return nombre;
    }

    @Override
    public void run() {

        int porcentaje = 0;
        int numAleatorio;
        try {
//aqui genero un numero aleatorio porque así ira simulando la carrera (uno mas rapido que el otro)
            while (porcentaje < 100) {
                numAleatorio = generaNumeroAleatorio(1, 15);
                System.out.println("Caballo " + nombre + " ha aumentado en " + numAleatorio);
                porcentaje += numAleatorio;
//con estas tres lineas notificamos de los cambios
                this.setChanged();
                this.notifyObservers(porcentaje);
                this.clearChanged();

                Thread.sleep(1000);

            }
            //cuando uno de los hilos gane, se interrumpen los demás.
        } catch (InterruptedException ex) {
            System.out.println("Hilo interrumpido");
        }

    }

    public static int generaNumeroAleatorio(int minimo, int maximo) {
        int num = (int) Math.floor(Math.random() * (maximo - minimo + 1) + (minimo));
        return num;
    }

}
