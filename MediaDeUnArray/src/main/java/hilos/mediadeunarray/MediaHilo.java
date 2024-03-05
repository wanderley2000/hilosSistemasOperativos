package hilos.mediadeunarray;
public class MediaHilo extends Thread{
    private int[] numeros;
    private int inicio;
    private int fin;
    private double resultado;
    
    //creamos un constructor

    public MediaHilo(int[] numeros, int inicio, int fin) {
        this.numeros = numeros;
        this.inicio = inicio;
        this.fin = fin;
        this.resultado = 0;  
    }
    @Override
    public void run(){
        int suma = 0;
        for (int i = inicio; i < fin; i++) {//Recorre de una posicion a otra (partiendo el array 1000 en 4)
            suma += numeros[i];
        }
        this.resultado = (double) suma/(this.fin - this.inicio);//aqui podemos ir accumulando las partes del array
    }

    public double getResultado() {
        return resultado;
    }
    
}
