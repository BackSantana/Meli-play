package com.company.meli_play;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Vestuario> minhasRoupas = new ArrayList<Vestuario>();
        minhasRoupas.add(new Vestuario("Reserva", "Tênis Preto"));
        minhasRoupas.add(new Vestuario("Prada", "Bolsa masculina"));

        GuardaRoupa guardaRoupaRoupa = new GuardaRoupa();

        System.out.println("\n ------ Guardando minhas roupas ------");
        System.out.println("Seu códido de seguraça: " + guardaRoupaRoupa.guardarVestuario(minhasRoupas));

        System.out.println("\n ------ Todas as minhas roupas ------");
        guardaRoupaRoupa.getGuardaRoupas();

        System.out.println("\n ------ Retirando as minhas roupas ------");
        guardaRoupaRoupa.devolverRoupas(0);

        System.out.println("\n ------ Todas as minhas roupas ------");
        guardaRoupaRoupa.getGuardaRoupas();

    }
}
