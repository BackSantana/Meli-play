package com.meli_play.linktracker.dto;

import com.meli_play.linktracker.utils.GerarID;
import com.meli_play.linktracker.model.Link;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class LinkRequest {
    @NotNull
    @NotEmpty
    private String url;
    @NotEmpty
    @NotEmpty
    @NotBlank
    private String senha;

    public LinkRequest(String senha, String url) {
        this.senha = senha;
        this.url = url;
    }

    public LinkRequest(){

    }

    public String getUrl() {
        return url;
    }

    public String getSenha() {
        return senha;
    }

    public Link convert(LinkRequest linkRequest){
        return new Link(GerarID.geraIdUrl(), linkRequest.getUrl(), 0, linkRequest.senha);
    }
}
