package com.luiz01204.modelos;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    private final LocalDate data = LocalDate.now();

    @Override
    public double calculaXp() {
        return XP_PADRAO + 20d;
    }

    public Mentoria(String nome, String descricao) {
        super(nome, descricao);
    }

    public LocalDate getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "Nome = " + getNome() +
                "Descrição = " + getDescricao() +
                "data = " + data +
                '}';
    }
}
