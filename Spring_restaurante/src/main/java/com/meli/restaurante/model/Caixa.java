package com.meli.restaurante.model;

import java.math.BigDecimal;

public class Caixa {
    private static BigDecimal valorTotalCaixa;

    public static void setValorTotalCaixa(BigDecimal valorTotalCaixa) {
        Caixa.valorTotalCaixa = valorTotalCaixa;
    }

    public static BigDecimal getValorTotalCaixa() {
        return valorTotalCaixa;
    }
}
