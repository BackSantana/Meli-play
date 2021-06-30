package com.company.meli_play;

/*
Crie uma classe Counter (sim, contador de programação) com métodos que permitam aumentar e diminuir seu valor.
A classe conterá um construtor padrão, um construtor com parâmetros, um construtor de cópia e os setters e
getters correspondentes (métodos de acesso).
 */
public class Counter {
    private int valor;

    public Counter() {
    }

    public Counter(int valor) {
        this.valor = valor;
    }

    public Counter(Counter counter) {
        this.valor = counter.getValor();
    }

    public int aumentar() {
        this.valor++;
        return this.valor;
    }

    public int aumentar(int valor) {
        this.valor += valor;
        return this.valor;
    }

    public int diminuir() {
        this.valor--;
        return this.valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
