package com.meli_play.gestao_pessoas.model;

import java.util.List;

/*
Crie uma API de gestão de clientes em uma loja. Um cliente deve ter id, nome, cpf, email e telefone.
Cada cliente pode ter diversos pedidos registrados
Você deve conseguir consultar todos os pedidos de um determinado cliente.
 */
public class Cliente {
    private long id;
    private String nome;
    private String email;
    private String telefone;
    private List<Pedido> pedidos;

    public Cliente(long id, String nome, String email, String telefone, List<Pedido> pedidos) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.pedidos = pedidos;
    }

    public long getId() {
        return id;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
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
}
