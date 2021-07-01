package com.meli.diploma.model;

import java.util.List;

public class Aluno {
    private long id;
    private String nome;
    private List<Disciplina> displinas;

    public Aluno(long id, String nome, List<Disciplina> displinas) {
        this.id = id;
        this.nome = nome;
        this.displinas = displinas;
    }

    public String getNome() {
        return nome;
    }

    public List<Disciplina> getDisplinas() {
        return displinas;
    }

    public long getId() {
        return id;
    }
}
