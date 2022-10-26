package com.example;

//* La interfaz Runnable proporciona un metodo alternativo para la utilización de la clase Thread 
//* para aquellas instancias que quieran ser ejecutadas como un hilo. */
public class Counter extends ThreadInterrumpedMain implements Runnable {

    public void run() {
        int x = 0;
        while (!Thread.currentThread().isInterrupted()) {

            System.out.println("El actual valor de X es: " + x++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}
