package com.luiz01204.modelos;

public class Curso extends Conteudo {
    private int cargaHoraria;

    @Override
    public double calculaXp() {
        return XP_PADRAO * cargaHoraria;
    }

    public Curso(String nome, String descricao, int cargaHoraria) {
        super(nome, descricao);
        this.cargaHoraria = cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "Nome = " + getNome() +
                "Descrição = " + getDescricao() +
                "carga Horaria = " + cargaHoraria +
                '}';
    }
}
