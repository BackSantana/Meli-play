package com.meli.diploma.controller;

import com.meli.diploma.dao.AlunoDao;
import com.meli.diploma.dto.AlunoDTOResquest;
import com.meli.diploma.model.Aluno;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/api")
public class AlunosController {
    AlunoDao dao = new AlunoDao();

    @PostMapping("/diploma")
    public ResponseEntity<Aluno> postAluno(@RequestBody AlunoDTOResquest alunoDTO, UriComponentsBuilder uriBuilder){
        Aluno aluno = AlunoDTOResquest.convertToDTO(alunoDTO, dao);
        dao.add(aluno);
        URI uri = uriBuilder.path("/api/{id}").buildAndExpand(aluno.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }

    @RequestMapping("/{id}")
    public AlunoDTOResquest getDiploma(@PathVariable long id){
        Aluno aluno = dao.getAluno(id);
        AlunoDTOResquest alunoDTOResquest = AlunoDTOResquest.convertToDTO(aluno);
        return alunoDTOResquest;
    }
}
