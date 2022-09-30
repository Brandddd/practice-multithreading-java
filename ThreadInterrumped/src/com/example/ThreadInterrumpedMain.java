/*
    Course of multithreading-java-lang
    Programmed by:
        Brandon Palacio Alvarez
        Mario Andres Ramirez
        Jefferson Ramirez

        */
package com.example;

/**
 *
 * @author Brandon David Palacio Alvarez, Mario Andrés Ramirez, Jefferson Ramirez
 */
public class ThreadInterrumpedMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Runnable r = new Counter();
        Thread t = new Thread(r);
        t.start();
    }

}
