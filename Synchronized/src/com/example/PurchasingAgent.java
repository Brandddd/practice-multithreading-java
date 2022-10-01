package com.example;

public class PurchasingAgent {

    public void purchase() {
        Store store = Store.getInstance();
        store.getShirtCount();
        store.authorizeCreditCard("1234", 15.00);
        Shirt shirt = store.takeShirt();

        if (shirt != null) {
            System.out.print("Producto comprado exitosamente: \n" + shirt);
        }
    }
}
