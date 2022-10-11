package com.example;

//* Clase Runnable para iniciar el Hilo. */
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
