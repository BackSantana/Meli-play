package com.meli_play.gestao_pessoas.controller;

import com.meli_play.gestao_pessoas.dto.ClienteRequest;
import com.meli_play.gestao_pessoas.dto.ClienteResponse;
import com.meli_play.gestao_pessoas.model.Cliente;
import com.meli_play.gestao_pessoas.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/api")
public class ClienteController {

    @Autowired
    ClienteService clienteService;

    @PostMapping
    public ResponseEntity<Cliente> cadastrar(@RequestBody ClienteRequest clienteRequest, UriComponentsBuilder uriComponentsBuilder){
        Cliente cliente = clienteRequest.convert(clienteRequest, clienteService);
        clienteService.add(cliente);
        URI uri = uriComponentsBuilder.path("/api/{id}").buildAndExpand(cliente.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }

    @GetMapping
    @RequestMapping("/{id}")
    public ClienteResponse obterAnuncio(@PathVariable long id) {
        Cliente cliente = clienteService.selectCliente(id);
        ClienteResponse casaDTO = ClienteResponse.convert(cliente);
        return casaDTO;
    }
}
