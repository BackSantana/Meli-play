package com.meli.diploma.repository;

import com.meli.diploma.model.Aluno;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AlunoRepository extends CrudRepository<Aluno, Long> {
}
