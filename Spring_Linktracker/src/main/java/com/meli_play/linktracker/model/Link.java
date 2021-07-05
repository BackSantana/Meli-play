package com.meli_play.linktracker.model;

public class Link {
    private long id;
    private String url;
    private long chamadas;
    private String senha;

    public Link(long id, String url, long chamadas, String senha) {
        this.id = id;
        this.url = url;
        this.chamadas = chamadas;
        this.senha = senha;
    }

    public long getId() {
        return id;
    }

    public String getUrl() {
        return url;
    }

    public long getChamadas() {
        return chamadas;
    }

    public void add(long quantidade){
        chamadas += quantidade;
    }

    public String getSenha() {
        return senha;
    }
}
