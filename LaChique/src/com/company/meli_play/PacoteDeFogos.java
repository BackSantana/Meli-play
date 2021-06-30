package com.company.meli_play;

import java.util.List;

public class PacoteDeFogos {
    List<FogoDeArtificio> listaDeFogos;

    public PacoteDeFogos(List<FogoDeArtificio> listaDeFogos) {
        this.listaDeFogos = listaDeFogos;
    }

    public void explodirPacoteEmSequencia() {
        for (FogoDeArtificio fogo: this.listaDeFogos) {
            fogo.explodir();
        }
    }
}
