package com.meli_play.gestao_pessoas.model;

import java.util.List;

//Um pedido tem id, produtos e valor total
public class Pedido {
    private long id;
    private List<Produto> produtos;
    private double valorTotal;

    public Pedido(long id, List<Produto> produtos, double valorTotal) {
        this.id = id;
        this.produtos = produtos;
        this.valorTotal = valorTotal;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public double getValorTotal() {
        return valorTotal;
    }
}
