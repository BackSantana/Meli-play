package com.meli_play.gestao_pessoas.dto;

import com.meli_play.gestao_pessoas.model.Cliente;
import com.meli_play.gestao_pessoas.model.Pedido;
import com.meli_play.gestao_pessoas.service.ClienteService;

import java.util.List;

public class ClienteRequest {
    private String nome;
    private String email;
    private String telefone;
    private List<Pedido> pedidos;

    public ClienteRequest(String nome, String email, String telefone, List<Pedido> pedidos) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.pedidos = pedidos;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public static Cliente convert(ClienteRequest clienteRequest, ClienteService service){
        return new Cliente(service.clientes().size()+1 ,clienteRequest.getNome(), clienteRequest.getEmail(), clienteRequest.getTelefone(),clienteRequest.getPedidos());
    }
}
