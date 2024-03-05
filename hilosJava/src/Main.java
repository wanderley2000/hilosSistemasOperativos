public class Main {
    public static void main(String[] args) {
        /*

        //Ejercicio #1

        HiloNumerosLetras h1 = new HiloNumerosLetras(1);
        HiloNumerosLetras h2 = new HiloNumerosLetras(2);

        //creamos dos hilos, debemos hacer un objeto de la clase thread y pasarle como parametro algo que implemente runnable, eje:

        Thread t1 = new Thread(h1);
        Thread t2 = new Thread(h2);

        /*Puedo hacer el run directamente 'h1.run()' pero es mejor hacerlo desde el propio hilo
        porque tiene metodos que nos permite darle más manejo
        //iniciamos los hilos.

        t1.start();
        t2.start();


        //Ejercicio #2

        Contador contador_1 = new Contador("Contador 1", 1);
        Contador contador_2 = new Contador("Contador 2", 5);
        Contador contador_3 = new Contador("Contador 3", 10);
        Contador contador_4 = new Contador("Contador 4", 3);
        Contador contador_5 = new Contador("Contador 5", 15);

        //Se crean los hilos.
        Thread t1 = new Thread(contador_1);
        Thread t2 = new Thread(contador_2);
        Thread t3 = new Thread(contador_3);
        Thread t4 = new Thread(contador_4);
        Thread t5 = new Thread(contador_5);

        //Se inician los hilos:
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        //.join() nos ayuda a que vaya pasando cada uno y se ejecute, hasta que no terminen todos los hilos no se acaba el programa.
        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            t5.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Fin del programa");

        */

    }
}