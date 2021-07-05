package com.meli.restaurante.controller;

import com.meli.restaurante.model.Mesa;
import com.meli.restaurante.model.Pedido;
import com.meli.restaurante.model.Prato;
import com.meli.restaurante.service.ServiceAll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/restaurante")
public class PedidoController {

    @Autowired
    ServiceAll serviceAll;

    @PostMapping("/Pedido")
    public ResponseEntity<Pedido> cadastrarPedido(@RequestBody Pedido pedido, UriComponentsBuilder uriComponentsBuilder){
        serviceAll.add(pedido);
        URI uri = uriComponentsBuilder.path("/api/{id}").buildAndExpand(pedido.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }
}
