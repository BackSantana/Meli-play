package com.meli.diploma.dao;

import com.meli.diploma.model.Aluno;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class AlunoDao {
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
