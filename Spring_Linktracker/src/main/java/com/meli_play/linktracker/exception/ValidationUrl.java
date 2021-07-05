package com.meli_play.linktracker.exception;

import java.net.MalformedURLException;

public class ValidationUrl extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public ValidationUrl(String mensagem) {
        super(mensagem);
    }
    public ValidationUrl(Exception e) {
        super(String.valueOf(e));
    }
}
