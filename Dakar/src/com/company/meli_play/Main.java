package com.company.meli_play;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        Corrida corrida = new Corrida(10.5, BigDecimal.valueOf(10000.0), "F1 - Grande prêmio São Paulo", 4);

        System.out.println("----- Grid de largada -----");
        corrida.registrarCarro(250.0, 5, 3, "SPLC1234");
        corrida.registrarCarro(300.0, 2, 6, "RJC1235");
        corrida.registrarCarro(320.0, 3, 2, "MGC1236");
        corrida.registrarMoto(290.0, 4, 3, "SEC1237");
        corrida.registrarMoto(30.0, 7, 7, "AMC1238");

        corrida.getListaVeiculos();

        System.out.println("\n ----- Hoje não... Hoje sim -----");
        corrida.removerVeiculoPorPlaca("MGC1236");
        System.out.println("\n ----- Vai entrar o safety car -----");
        corrida.socorrerMoto("SEC1237");
        System.out.println("\n ----- Final da corrida -----");

        corrida.getVencedor();
     }
}
