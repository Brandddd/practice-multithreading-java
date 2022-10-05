package com.example;

public class PracticeThread extends Thread {

    /*
     * AQUI LLEGAN LOS DOS HILOS CREADOS COMO P1 Y P2 TOMANDO EL ROL DE AGENTES Y
     * LLAMAN EL METODO PurchasingAgent() SIENDO ASÍ DOS HILOS.
     */

    @Override
    public void run() {
        PurchasingAgent agent = new PurchasingAgent();
        agent.purchase();
    }

}