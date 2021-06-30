package com.company.meli_play;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Corrida {
    private double distancia;
    private BigDecimal premioEmDolares;
    private String nome;
    private int quantidadeDeVeiculos;
    private List<Veiculo> veiculos;
    private SocorristaCarro socorristaCarro;
    private SocorristaMoto socorristaMoto;

    public Corrida(double distancia, BigDecimal premioEmDolares, String nome, int quantidadeDeVeiculos) {
        this.distancia = distancia;
        this.premioEmDolares = premioEmDolares;
        this.nome = nome;
        this.quantidadeDeVeiculos = quantidadeDeVeiculos -1;
        this.veiculos = new ArrayList<>();
        this.socorristaCarro = new SocorristaCarro();
        this.socorristaMoto = new SocorristaMoto();
     }

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

    public void removerVeiculoo(Veiculo veiculo){
        this.veiculos.remove(veiculo);
    }

    public void removerVeiculoPorPlaca(String placa){
        veiculos.removeIf(veiculo -> veiculo.getPlaca() == placa);
    }

    public void getListaVeiculos(){
        veiculos.forEach(veiculo -> System.out.println(veiculo));
    }

    public void socorrerCarro(String placa){
        socorristaCarro.socorrer((Carro) findIndexPlaca(placa));
    }

    public void socorrerMoto(String placa){
        socorristaMoto.socorrer((Moto) findIndexPlaca(placa));
    }

    public void getVencedor(){
        veiculos.forEach(veiculo -> veiculo.setValorPorsicao(calcularPontuacao(veiculo)));
        Comparator<Veiculo> comparator = Comparator.comparing( Veiculo::getValorPorsicao );
        Veiculo maxObject = veiculos.stream().max(comparator).get();
        System.out.println("O grande vencendo é Rubens Barrichelo: " + maxObject);
    }

    private double calcularPontuacao(Veiculo veiculo) {
        return (veiculo.getVelocidade() * veiculo.getAceleracao()) / (veiculo.getAnguloDeGiro() * (veiculo.getPeso() - (veiculo.getRoda() * 100)));
    }

    //Fiz dessa forma retornando uma lista. Não sabia como retornar um objeto de veiculo.
    private Veiculo findIndexPlaca(String placa) {
        List<Veiculo> listAux = veiculos.stream().filter(veiculo -> veiculo.getPlaca().equals(placa)).collect(Collectors.toList());
        return listAux.get(0);
     }
}
