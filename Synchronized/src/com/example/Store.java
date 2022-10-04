package com.example;

import java.util.Deque;
import java.util.LinkedList;

public class Store {
    
    private Deque<Shirt> shirts = new LinkedList<>();
    //singleton
    private static Store instance = new Store();
    //singleton
    
    private Store() {
    }
    //singleton

    public static Store getInstance() {
        return instance;
    }
    
    public void addShirt(Shirt shirt) {
        System.out.println("Adding a shirt to the store.");
        shirts.push(shirt);
        System.out.println("Total shirts in stock: " + shirts.size());
    }
    
    public Shirt takeShirt() {
        return shirts.pop();
    }
    
    public int getShirtCount() {
        return shirts.size();
    }
    
    public static synchronized boolean authorizeCreditCard(String accountNumber, double amount) {
        //placeholder method to test workflow
        //since this would normally communicate with a external source
        //this method should take longer to execute...
        
        int seconds = (int) (Math.random() * 3 + 1); //!Obtencion de un numero aleatorio que oscile entre 3 y 1. 
        System.out.println("La ejecución se retrasará " + seconds + " milisegundos. ");

        try {
            Thread.sleep(seconds);
        } catch (Exception e) {
            System.out.println("El hilo ha sido interrumpido. ");
        }

        return true;
    }
}