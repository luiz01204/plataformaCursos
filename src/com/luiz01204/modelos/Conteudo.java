package com.luiz01204.modelos;

public abstract class Conteudo {
    private String nome;
    private String descricao;
    protected final double XP_PADRAO = 10d;

    public double calculaXp(){
        return XP_PADRAO;
    }

    public Conteudo(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
