package com.meli.diploma.model;

public class Disciplina {
    private String nome;
    private double nota;

    public Disciplina(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public double getNota() {
        return nota;
    }
}
