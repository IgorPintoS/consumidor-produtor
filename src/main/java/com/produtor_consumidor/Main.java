package com.produtor_consumidor;

import com.produtor_consumidor.controller.ProdutorController;

public class Main {
    public static void main(String[] args) {

        Runnable tarefaProdutoora = new ProdutorController();

        Thread threadProdutora = new Thread(tarefaProdutoora, "Thread Produtora");

        threadProdutora.start();

        System.out.println("A Thread Principal finalizou o setup.");
    }
}