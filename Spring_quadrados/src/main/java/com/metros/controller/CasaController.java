package com.metros.controller;

import com.metros.dao.CasaDAO;
import com.metros.dto.CasaDTO;
import com.metros.model.Casa;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/api")
public class CasaController {
    private CasaDAO dao = new CasaDAO();

    @PostMapping
    public ResponseEntity<Casa>cadastrar(@RequestBody CasaDTO casaDTO, UriComponentsBuilder uriComponentsBuilder){
        Casa casa = casaDTO.converte(casaDTO, dao);
        dao.adicionar(casa);
        URI uri = uriComponentsBuilder.path("/api/{id}").buildAndExpand(casa.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }

    @GetMapping
    @RequestMapping("/{id}")
    public CasaDTO obterAnuncio(@PathVariable long id) {
        Casa casa = dao.getCasa(id);
        CasaDTO casaDTO = CasaDTO.converte(casa);
        return casaDTO;
    }
}
