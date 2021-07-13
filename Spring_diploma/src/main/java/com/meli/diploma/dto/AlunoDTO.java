package com.meli.diploma.dto;

import com.meli.diploma.model.Aluno;
import com.meli.diploma.model.Disciplina;
import java.util.List;

public class AlunoDTO {
    private long id;
    private String nome;
    private double media;
    private String mensagem;
    private List<Disciplina> disciplinas;

    public AlunoDTO(Aluno aluno, String mensagem) {
        this.id = aluno.getId();
        this.nome = aluno.getNome();
        this.disciplinas = aluno.getdisciplinas();
        this.media = aluno.getMedia();
        this.mensagem = mensagem;
    }

    public AlunoDTO(Aluno aluno) {
        this.id = aluno.getId();
        this.nome = aluno.getNome();
        this.disciplinas = aluno.getdisciplinas();
        this.media = aluno.getMedia();
    }

    public AlunoDTO(){}

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getMedia() {
        return media;
    }

    public String getMensagem() {
        return mensagem;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }
}
