package com.example;

public class PurchasingAgent {

    public PurchasingAgent() {
    }

    public void purchase() {
        Store store = Store.getInstance(); // *Obteniendo referencia de la clase Store.
        store.getShirtCount(); // *Verifica que la tienda tiene al menos una camisa en existencia.
        store.authorizeCreditCard("1234", 15.00); // *Compra con tarjeta de crédito.

        Shirt shirt = store.takeShirt(); // *Tomar una camiseta de la tienda.

        if (shirt != null) {   // *Comprobación
            System.out.println("\nEl pago de: " + shirt + "Se ha realizado exitosamente. ");
        } else {
            System.out.println("La transacción ha fallado. ");
        }
    }
}