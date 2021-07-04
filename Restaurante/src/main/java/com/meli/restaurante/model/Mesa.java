package com.meli.restaurante.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;

public class Mesa {
    private long id;
    @JsonIgnore
    private List<Pedido> pedidos;
    private double valorTotalConsumo;

    public Mesa(long id, List<Pedido> pedidos, double valorTotalConsumo) {
        this.id = id;
        this.pedidos = pedidos;
        this.valorTotalConsumo = valorTotalConsumo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getValorTotalConsumo() {
        return valorTotalConsumo;
    }
}
