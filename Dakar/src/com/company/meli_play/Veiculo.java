package com.company.meli_play;

import java.util.Comparator;
import java.util.Objects;

public class Veiculo{
    private double velocidade, aceleracao, anguloDeGiro, peso;
    private String placa;
    private int roda;
    private Double valorPorsicao;

    public Veiculo(double velocidade, double aceleracao, double anguloDeGiro, String placa, double peso, int roda) {
        this.velocidade = velocidade;
        this.aceleracao = aceleracao;
        this.anguloDeGiro = anguloDeGiro;
        this.placa = placa;
        this.peso = peso;
        this.roda = roda;
    }

    public String getPlaca() {
        return placa;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public double getAceleracao() {
        return aceleracao;
    }

    public double getAnguloDeGiro() {
        return anguloDeGiro;
    }

    public double getPeso() {
        return peso;
    }

    public int getRoda() {
        return roda;
    }

    public Double getValorPorsicao() {
        return valorPorsicao;
    }

    public void setValorPorsicao(Double valorPorsicao) {
        this.valorPorsicao = valorPorsicao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Veiculo veiculo = (Veiculo) o;
        return Objects.equals(placa, veiculo.placa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(placa);
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "velocidade=" + velocidade +
                ", placa='" + placa + '\'' +
                '}';
    }
}
