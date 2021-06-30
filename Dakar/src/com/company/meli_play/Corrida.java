package com.company.meli_play;

import java.math.BigDecimal;
import java.util.List;

public class Corrida {
    private double distancia;
    private BigDecimal premioEmDolares;
    private String nome;
    private int quantidadeDeVeiculos;
    private List<Veiculo> veiculos;

    public void registrarCarro(double velocidade, double aceleracao, double anguloDeGiro, String placa){
        if(veiculos.size() <= this.quantidadeDeVeiculos)
            veiculos.add(new Carro(velocidade, aceleracao, anguloDeGiro, placa));
        else
            System.out.println("Não é mais permitido cadastrar veículos para a corrida");
    }

    public void registrarMoto(double velocidade, double aceleracao, double anguloDeGiro, String placa){
        if(veiculos.size() <= this.quantidadeDeVeiculos)
            veiculos.add(new Moto(velocidade, aceleracao, anguloDeGiro, placa));
        else
            System.out.println("Não é mais permitido cadastrar veículos para a corrida");
    }
}
