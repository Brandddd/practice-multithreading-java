package com.example;

public class PurchasingAgent {

    private static int cantidad;

    public PurchasingAgent() {
        cantidad = cantidad + 1;
        System.out.println("Cantidad de instancias creadas: " + cantidad); // !Constructor que me indica la cantidad de
                                                                           // instacias creadas de la clase
    }

    public void purchase() {
        Store store = Store.getInstance();
        store.getShirtCount();

        double thread_id = Thread.currentThread().getId(); // !OBTENER REFERENCIA AL HILO Y SU ID
        String thread_name = Thread.currentThread().getName(); // !OBTENER REFERENCIA AL HILO Y SU NOMBRE
        System.out.println("Hilo ejecutandose con Codigo: " + thread_id + " y Nombre: " + thread_name);

        try {
            store.authorizeCreditCard("1234", 15.00);
            Shirt shirt = store.takeShirt();
            if (shirt != null) {
                System.out.print("Producto comprado exitosamente: \n" + shirt);
            } else {
                System.out.print("Transaccion no aprobada. \n");
            }
        } catch (Exception e) {
            System.out.print("Ha ocurrido un error al realizar la transaccion. Por favor, intente nuevamente. \n");
        }
    }
}
