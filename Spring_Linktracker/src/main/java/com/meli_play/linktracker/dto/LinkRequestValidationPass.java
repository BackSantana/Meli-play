package com.meli_play.linktracker.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

public class LinkRequestValidationPass {
    @NotEmpty
    @NotEmpty
    @NotBlank
    private String senha;

    public LinkRequestValidationPass(String senha) {
        this.senha = senha;
    }

    public LinkRequestValidationPass(){

    }

    public String getSenha() {
        return senha;
    }
}
