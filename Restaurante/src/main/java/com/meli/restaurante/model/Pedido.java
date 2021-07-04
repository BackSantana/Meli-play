package com.meli.restaurante.model;
import java.util.List;

public class Pedido {
    private long id;
    private Mesa mesa;
    private List<Prato> pratos;
    private double valorTotal;

    public Pedido(long id, Mesa mesa, List<Prato> pratos, double valorTotal) {
        this.id = id;
        this.mesa = mesa;
        this.pratos = pratos;
        this.valorTotal = valorTotal;
    }

    public long getId() {
        return id;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public List<Prato> getPratos() {
        return pratos;
    }
}
