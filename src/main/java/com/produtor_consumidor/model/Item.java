package com.produtor_consumidor.model;

import com.produtor_consumidor.enums.Prioridade;

import java.util.concurrent.ThreadLocalRandom;

public class Item {
    String sequencia;
    Prioridade prioridade;

    public Item(String sequencia, Prioridade prioridade) {
        this.sequencia = gerarSequenciaPelaPrioridade(prioridade);
        this.prioridade = prioridade;
    }

    public String gerarSequenciaPelaPrioridade(Prioridade prioridade) {
        StringBuilder stringBuilder = new StringBuilder(5);
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        switch (prioridade) {
            case PRIORITARIO -> {
                ThreadLocalRandom.current().ints(4, 0)
                        .mapToObj(caracteres::charAt)
                        .forEach(stringBuilder::append);

                return stringBuilder.insert(0, "P").toString();
            }

            case AUTOATENDIMENTO -> {
                ThreadLocalRandom.current().ints(4, 0)
                        .mapToObj(caracteres::charAt)
                        .forEach(stringBuilder::append);

                return stringBuilder.insert(0, "A").toString();
            }

            default -> {
                ThreadLocalRandom.current().ints(4, 0)
                        .mapToObj(caracteres::charAt)
                        .forEach(stringBuilder::append);

                return stringBuilder.insert(0, "N").toString();
            }
        }
    }
}
