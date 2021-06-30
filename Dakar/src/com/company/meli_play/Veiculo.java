package com.company.meli_play;

public class Veiculo {
    double velocidade, aceleracao, anguloDeGiro, peso;
    String placa;
    int roda;

    public Veiculo(double velocidade, double aceleracao, double anguloDeGiro, String placa, double peso, int roda) {
        this.velocidade = velocidade;
        this.aceleracao = aceleracao;
        this.anguloDeGiro = anguloDeGiro;
        this.placa = placa;
        this.peso = peso;
        this.roda = roda;
    }
}
