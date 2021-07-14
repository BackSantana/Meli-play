package com.meli.diploma.controller;

import com.meli.diploma.dto.AlunoDTO;
import com.meli.diploma.form.AlunoForm;
import com.meli.diploma.model.Aluno;
import com.meli.diploma.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;

@RestController
@RequestMapping("/api")
public class AlunosController {

    @Autowired
    AlunoService alunoService;

    @PostMapping("/analyNotes")
    public ResponseEntity<AlunoDTO> postAluno(@RequestBody @Valid AlunoForm alunoForm, UriComponentsBuilder uriBuilder){
        Aluno aluno = AlunoForm.AlunoFormToAluno(alunoForm);
        AlunoDTO alunoDTO = alunoService.obterDiploma(aluno);
        URI uri = uriBuilder.path("/api/{id}").buildAndExpand(alunoDTO.getId()).toUri();
        return ResponseEntity.created(uri).body(alunoDTO);
    }

    @RequestMapping("/{id}")
    public AlunoDTO getDiploma(@PathVariable long id){
        AlunoDTO alunoDTO = new AlunoDTO(alunoService.getAluno(id));
        return alunoDTO;
    }
}
