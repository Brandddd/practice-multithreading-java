package com.example;

public class PurchasingAgent {

    private static int contador;

    public PurchasingAgent() {
        System.out.println("Creando instancia de la clase... "); // * Creacion de instancia de la clase PurchasingAgent
        contador++;
    }

    public static int getCantidad() {
        return contador;
    }

    // Finaliza el hilo, y atrapa el error en caso de que halla un error.
    protected void finalize() throws Throwable {
        contador--;
        super.finalize();
    }

    public void purchase() {

        Thread t = Thread.currentThread();
        System.out.println("Hilo ejecutandose con nombre " + t.getName() + " y codigo " + t.getId());

        Store store = Store.getInstance(); // *Obteniendo referencia de la clase Store para poder sicronizarla

        synchronized (store) {
            if (store.getShirtCount() > 0 && store.authorizeCreditCard("1234", 15.00)) {
                Shirt shirt = store.takeShirt(); // * Toma shirt del store */
                System.out.println("\nEl pago de:\n" + shirt + "Se ha realizado exitosamente. ");
                System.out.println();
            } else {
                System.out.println("No hay stock disponible.\n");
            }
        }
    }
}