package com.meli.diploma.repository;

import com.meli.diploma.model.Aluno;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class AlunoRepository {
    private static List<Aluno> alunos = new ArrayList<>();

    public List<Aluno> getAlunos(){
        return alunos;
    }

    public void add(Aluno aluno){
        alunos.add(aluno);
    }

    public Aluno getAluno(long id){
        Optional<Aluno> aluno = alunos.stream().filter(a -> a.getId() == id).findFirst();
        if(!aluno.isPresent())
            return null;
        return aluno.get();
    }
}
