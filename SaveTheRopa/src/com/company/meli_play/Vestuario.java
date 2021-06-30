package com.company.meli_play;

public class Vestuario {
    private String marca;
    private String modelo;

    public Vestuario(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return   " Marca='" + marca + '\'' +
                " Modelo='" + modelo + '\'';
    }
}
