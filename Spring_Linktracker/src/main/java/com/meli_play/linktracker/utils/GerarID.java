package com.meli_play.linktracker.utils;

public class GerarID {
    private static long idUrl = 1L;

    public static long geraIdUrl(){
        return idUrl++;
    }
}
