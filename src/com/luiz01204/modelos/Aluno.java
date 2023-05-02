package com.luiz01204.modelos;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Aluno {
    private String nome;
    private Set<Conteudo> conteudosIncritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public void increverBootCamp(BootCamp bootCamp){
        this.conteudosIncritos.addAll(bootCamp.getConteudos());
        bootCamp.getAlunosInscritos().add(this);
    }

    public void progredir(){
        Optional<Conteudo> conteudo = this.conteudosIncritos.stream().findFirst();
        if (conteudo.isPresent()){
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosIncritos.remove(conteudo.get());
        } else {
            System.err.println("Você não está matriculado em nem um conteúdo.");
        }
    }

    public double calculaXp(){
        return this.conteudosConcluidos.stream().mapToDouble(Conteudo::calculaXp).sum();
    }

    public Aluno(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosIncritos() {
        return conteudosIncritos;
    }

    public void setConteudosIncritos(Set<Conteudo> conteudosIncritos) {
        this.conteudosIncritos = conteudosIncritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome = '" + nome + '\'' +
                ", conteudosIncritos = " + conteudosIncritos +
                ", conteudosConcluidos = " + conteudosConcluidos +
                '}';
    }
}
