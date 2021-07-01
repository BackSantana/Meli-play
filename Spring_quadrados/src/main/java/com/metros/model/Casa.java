package com.metros.model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*
Como requisito funcional é solicitado que a API:
a) Informe o número total de metros quadrados da casa.
b) Indique o valor da casa tendo em consideração R$ 800 por metro quadrado.
c) Informe o maior cômodo.
d) Retorne a quantidade de metros quadrados por cômodo.
 */
public class Casa {
    private long id;
    private String nome;
    private String endereco;
    private List<Comodo> comodos = new ArrayList<>();

    public Casa(long id, String nome, String endereco, List<Comodo> comodos) {
        this.nome = nome;
        this.endereco = endereco;
        this.comodos = comodos;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public List<Comodo> getComodos() {
        return comodos;
    }

    public long getId() {
        return id;
    }

    public double calcularAreaCasa(){
        comodos.forEach(c -> c.setMetrosQuadrados(c.calculaAreaComodo()));
        Double sum = comodos.stream().mapToDouble(x -> x.getMetrosQuadrados()).sum();
        return sum;
    }

    public Comodo maiorComodo(){
        Comparator<Comodo> comparator = Comparator.comparing(Comodo::getMetrosQuadrados);
        Comodo maxObject = comodos.stream().max(comparator).get();
        return maxObject;
    }

    public List<Comodo> metroQuadradoPorComodo(){
        return comodos.stream().collect(Collectors.toList());
    }

    public double valorCasa(){
        return 800 * calcularAreaCasa();
    }
}
