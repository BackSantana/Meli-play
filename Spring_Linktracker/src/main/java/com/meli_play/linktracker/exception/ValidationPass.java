package com.meli_play.linktracker.exception;

public class ValidationPass extends RuntimeException{

    private static final long serialVersionUID = 1L;

    public ValidationPass(String mensagem) {
        super(mensagem);
    }
    public ValidationPass(Exception e) {
        super(String.valueOf(e));
    }
}
