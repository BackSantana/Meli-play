package com.meli_play.linktracker.dto;

public class ExceptionDto {
    private String campo;
    private String mensagem;

    public ExceptionDto(String campo, String mensagem) {
        this.campo = campo;
        this.mensagem = mensagem;
    }

    public ExceptionDto(String message) {
        this.mensagem = message;
    }

    public String getCampo() {
        return campo;
    }

    public String getMensagem() {
        return mensagem;
    }
}
