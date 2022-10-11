/*
    Course of multithreading-java-lang
    Practice 12-2
    Programmed by:
        Brandon Palacio Alvarez
        Mario Andres Ramirez
        Jefferson Ramirez
        */
package com.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Brandon David Palacio Alvarez, Mario Andrés Ramirez, Jefferson
 *         Ramirez
 */
public class ThreadInterrumpedMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Runnable r = new Counter();
        Thread t = new Thread(r);
        t.start();

        // * Verificar si el hilo esta activo. */
        if (t.isAlive()) {
            System.out.println("El hilo esta activo. ");
        } else {
            System.out.println("Hilo está Inactivo. ");
        }

        // * Lee la tecla enter para detener la ejecución. */
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Pulse enter para detener la ejecución. ");
            br.readLine();
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error. ");
        }

        // * Retraso de 1 segundo. */
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Ha ocurrido un error. ");
        }

        // * Interrumpir el hilo. */
        t.interrupt();
    }

}
