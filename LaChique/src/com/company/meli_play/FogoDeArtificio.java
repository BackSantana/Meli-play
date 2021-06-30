package com.company.meli_play;

import java.nio.charset.StandardCharsets;
import java.util.Random;

public class FogoDeArtificio {
    private String cor;
    private String formato;
    private String barulho;

    public FogoDeArtificio(String cor, String formato, String barulho) {
        this.cor = cor;
        this.formato = formato;
        this.barulho = barulho;
    }

    public void explodir() {
        System.out.println("Olha a explosão " + this.barulho);
    }

    public String getBarulho() {
        return barulho;
    }
}
