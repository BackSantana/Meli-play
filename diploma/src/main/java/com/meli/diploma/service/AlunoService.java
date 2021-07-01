package com.meli.diploma.service;

import com.meli.diploma.model.Aluno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

public class AlunoService {

    public static double media(Aluno aluno){
        return aluno.getDisplinas().stream().mapToDouble(d -> d.getNota()).sum() / aluno.getDisplinas().size();
    }

    public static String mensagemMedia(double media){
        String mensagem = (media > 9) ? "Parabéns, você foi aprovado(a)!"
                : "Você foi reprovado(a)!";
        return mensagem;
    }
}
