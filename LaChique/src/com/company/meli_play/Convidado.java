package com.company.meli_play;

public class Convidado {
    private String nome;
    private TiposConvidado tiposConvidado;
    private String comemoracao;

    public Convidado(String nome, TiposConvidado tiposConvidado) {
        this.nome = nome;
        this.tiposConvidado = tiposConvidado;
    }

    public String comer(){
        if(!String.valueOf(tiposConvidado).equals("MELI"))
            return this.nome + " grita: Uhhaaa!!";
        return this.nome + " grita: Viva la Chiqui!!";
    }
}
