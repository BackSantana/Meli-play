package com.meli.diploma.model;

import java.util.List;

public class Aluno {
    private long id;
    private String nome;
    private double media;
    private List<Disciplina> disciplinas;

    public Aluno(long id, String nome, List<Disciplina> disciplinas) {
        this.id = id;
        this.nome = nome;
        this.disciplinas = disciplinas;
    }

    public String getNome() {
        return nome;
    }

    public double getMedia() {
        return media;
    }

    public List<Disciplina> getdisciplinas() {
        return disciplinas;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public long getId() {
        return id;
    }
}
