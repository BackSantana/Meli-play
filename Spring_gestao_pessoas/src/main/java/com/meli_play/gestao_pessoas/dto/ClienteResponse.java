package com.meli_play.gestao_pessoas.dto;

import com.meli_play.gestao_pessoas.model.Cliente;
import com.meli_play.gestao_pessoas.model.Pedido;

import java.util.List;

public class ClienteResponse {
    private String nome;
    private List<Pedido> pedidos;

    public ClienteResponse(String nome, List<Pedido> pedidos) {
        this.nome = nome;
        this.pedidos = pedidos;
    }

    public String getNome() {
        return nome;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public static ClienteResponse convert(Cliente cliente){
        return new ClienteResponse(cliente.getNome(), cliente.getPedidos());
    }
}
