package com.company.meli_play;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Convidado> convidados = new ArrayList<>();
        List<PacoteDeFogos> fogosDeArtificios = new ArrayList<>();

        List<FogoDeArtificio> listaFogos01 = new ArrayList<>();
        listaFogos01.add(new FogoDeArtificio("Branco om preto", "Estrela", "Tcha cabumm!!!"));
        listaFogos01.add(new FogoDeArtificio("Azul", "Estrela", "POW!!!"));
        PacoteDeFogos pacote01 = new PacoteDeFogos(listaFogos01);

        List<FogoDeArtificio> listaFogos02 = new ArrayList<>();
        listaFogos02.add(new FogoDeArtificio("Verde", "Estrela", "Xiiii!!"));
        PacoteDeFogos pacote02 = new PacoteDeFogos(listaFogos02);

        fogosDeArtificios.add(pacote01);
        fogosDeArtificios.add(pacote02);

        System.out.println("Os Convidados chegaram!");
        convidados.add(new Convidado("Carlos", TiposConvidado.MELI));
        convidados.add(new Convidado("Sergio", TiposConvidado.MELI));
        convidados.add(new Convidado("Santana", TiposConvidado.MELI));
        convidados.add(new Convidado("Santos", TiposConvidado.STANDART));
        convidados.add(new Convidado("Renatinho", TiposConvidado.STANDART));
        convidados.add(new Convidado("Presuntinho", TiposConvidado.STANDART));


        System.out.println("\nChegou o momento de cortar o bola... ");

        convidados.forEach(convidado -> System.out.println(convidado.comer()) );

        System.out.println("\nFogos... ");
        fogosDeArtificios.forEach(fogo -> fogo.explodirPacoteEmSequencia());
    }
}
