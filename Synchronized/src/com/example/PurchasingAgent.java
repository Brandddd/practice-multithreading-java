package com.example;

public class PurchasingAgent {

    public void purchase() {
        Store store = Store.getInstance();
        store.getShirtCount();

        try {
            store.authorizeCreditCard("1234", 15.00);
            Shirt shirt = store.takeShirt();
            if (shirt != null) {
                System.out.print("Producto comprado exitosamente: \n" + shirt);
            } else {
                System.out.print("Transaccion no aprobada. \n");
            }
        } catch (Exception e) {
            System.out.print("Ocurrio un error al realizar la transaccion. Por favor, intente nuevamente. \n");
        }
    }
}
