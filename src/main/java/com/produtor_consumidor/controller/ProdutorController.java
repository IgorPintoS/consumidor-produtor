package com.produtor_consumidor.controller;

public class ProdutorController implements Runnable {

    @Override
    public void run() {
        System.out.println("O Produtor está ativo!");
    }
}
