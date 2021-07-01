package com.metros.model;

public class Comodo {
    private String nome;
    private double largura;
    private double comprimento;
    private double metrosQuadrados;

    public Comodo(String nome, double largura, double comprimento) {
        this.nome = nome;
        this.largura = largura;
        this.comprimento = comprimento;
    }

    public double calculaAreaComodo(){
        return largura * comprimento;
    }

    public void setMetrosQuadrados(double metrosQuadrados) {
        this.metrosQuadrados = metrosQuadrados;
    }

    public double getMetrosQuadrados() {
        return metrosQuadrados;
    }

    public String getNome() {
        return nome;
    }

    public double getLargura() {
        return largura;
    }

    public double getComprimento() {
        return comprimento;
    }

    @Override
    public String toString() {
        return "Comodo{" +
                "nome='" + nome + '\'' +
                ", largura=" + largura +
                ", comprimento=" + comprimento +
                ", metrosQuadrados=" + metrosQuadrados +
                '}';
    }
}
