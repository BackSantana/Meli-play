package com.meli.diploma.service;

import com.meli.diploma.dto.AlunoDTO;
import com.meli.diploma.form.AlunoForm;
import com.meli.diploma.model.Aluno;
import com.meli.diploma.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlunoService {

    @Autowired
    AlunoRepository alunoRepository;

    public AlunoDTO obterDiploma(Aluno aluno){
        aluno.setMedia(media(aluno));
        AlunoDTO alunoDTO = new AlunoDTO(aluno, mensagemMedia(aluno.getMedia()));

        alunoRepository.save(aluno);
        return alunoDTO;
    }

    public static double media(Aluno aluno){
        return aluno.getdisciplinas().stream().mapToDouble(d -> d.getNota()).sum() / aluno.getdisciplinas().size();
    }

    public static String mensagemMedia(double media){
        String mensagem = (media > 9) ? "Parabéns, você foi aprovado(a)!"
                : "Você foi reprovado(a)!";
        return mensagem;
    }



    public Aluno getAluno(long id){
        return alunoRepository.findById(id).orElse(null);
    }
}
