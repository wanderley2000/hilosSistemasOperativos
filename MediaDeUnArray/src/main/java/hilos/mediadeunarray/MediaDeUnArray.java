package hilos.mediadeunarray;
import hilos.mediadeunarray.MediaHilo;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MediaDeUnArray {

    public static void main(String[] args) {
        
        int[] numeros = new int[1000];
        
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i;
        }
        MediaHilo mh1 = new MediaHilo(numeros, 0, 250);
        MediaHilo mh2 = new MediaHilo(numeros, 250, 500);
        MediaHilo mh3 = new MediaHilo(numeros, 500, 750);
        MediaHilo mh4 = new MediaHilo(numeros, 750, 1000);
        
        //Iniciamos los hilos.
        
        mh1.start();
        mh2.start();
        mh3.start();
        mh4.start();
        
        try {
            //Usamos el .join() para que un hilo espere al otro y esperar a que todos acaben
            mh1.join();
            mh2.join();
            mh3.join();
            mh4.join();
            //Obtiene el resultado de cada iteracion
            double resultado1 = mh1.getResultado();
            double resultado2 = mh2.getResultado();
            double resultado3 = mh3.getResultado();
            double resultado4 = mh4.getResultado();
            //saca la media de cada hilo y las suma y divide entre la cantidad total
            double mediaGlobal = (resultado1 + resultado2 + resultado3 + resultado4)/ 4;
            System.out.println("Media: " + mediaGlobal);
            
        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());        }
        
        
    }
}
