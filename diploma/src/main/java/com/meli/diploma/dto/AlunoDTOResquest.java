package com.meli.diploma.dto;

import com.meli.diploma.dao.AlunoDao;
import com.meli.diploma.model.Aluno;
import com.meli.diploma.model.Disciplina;
import com.meli.diploma.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class AlunoDTOResquest {
    private String nome;
    private double media;
    private String mensagem;
    private List<Disciplina> disciplinas = new ArrayList<>();


    @Autowired
    AlunoService alunoService;

    public AlunoDTOResquest(String nome, List<Disciplina> disciplinas, double media, String mensagem) {
        this.nome = nome;
        this.disciplinas = disciplinas;
        this.media = media;
        this.mensagem = mensagem;
    }

    public double getMedia() {
        return media;
    }

    public String getMensagem() {
        return mensagem;
    }

    public String getNome() {
        return nome;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public static AlunoDTOResquest convertToDTO(Aluno aluno){
        double media = AlunoService.media(aluno);
        return new AlunoDTOResquest(aluno.getNome(), aluno.getDisplinas(), media, AlunoService.mensagemMedia(media));
    }

    public static Aluno convertToDTO(AlunoDTOResquest aluno, AlunoDao dao){
        return new Aluno(dao.getAlunos().size()+1, aluno.getNome(), aluno.getDisciplinas());
    }
}
