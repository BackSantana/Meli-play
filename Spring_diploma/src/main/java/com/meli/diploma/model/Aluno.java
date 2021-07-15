package com.meli.diploma.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private double media;
    @OneToMany( cascade = {CascadeType.MERGE, CascadeType.REMOVE})
    private List<Disciplina> disciplinas;

    public Aluno(long id, String nome, List<Disciplina> disciplinas) {
        this.id = id;
        this.nome = nome;
        this.disciplinas = disciplinas;
    }

    public Aluno() {

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
