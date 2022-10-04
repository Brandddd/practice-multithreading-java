package com.example;

public class PurchasingAgent {

    private static int contador;

    public PurchasingAgent() {
        contador++;
    }

    public static int getCantidad() {
        return contador;
    }

    protected void finalize() throws Throwable {
        contador--;
        super.finalize();
    }

    public static void purchase() {

        System.out.println("Cantidad de instancias de la clase: " + PurchasingAgent.getCantidad()); // *Instancias
        System.out.println("Hilo ejecutandose con nombre " + Thread.currentThread().getName() + " y codigo "
                + Thread.currentThread().getId());

        Store store = Store.getInstance(); // *Obteniendo referencia de la clase Store.
        store.getShirtCount(); // *Verifica que la tienda tiene al menos una camisa en existencia.
        store.authorizeCreditCard("1234", 15.00); // *Compra con tarjeta de crédito.
        Shirt shirt = store.takeShirt(); // *Tomar una camiseta de la tienda.

        if (shirt != null) { // *Comprobación
            System.out.println("\nEl pago de: " + shirt + "Se ha realizado exitosamente. ");
        } else {
            System.out.println("La transacción ha fallado porque ha ocurrido un error. ");
        }
    }
}