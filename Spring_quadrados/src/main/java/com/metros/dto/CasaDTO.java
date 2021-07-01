package com.metros.dto;

import com.metros.dao.CasaDAO;
import com.metros.model.Casa;
import com.metros.model.Comodo;

import java.util.ArrayList;
import java.util.List;

public class CasaDTO {
    private String nome;
    private String endereco;
    private double areaTotalCasa;
    private double valorCasa;
    private List<Comodo> comodos = new ArrayList<>();
    private Comodo maiorComodo;

    public CasaDTO(String nome, String endereco, List<Comodo> comodos, double areaTotalCasa, double valorCasa, Comodo maiorComodo) {
        this.nome = nome;
        this.endereco = endereco;
        this.areaTotalCasa = areaTotalCasa;
        this.valorCasa = valorCasa;
        this.maiorComodo = maiorComodo;
        this.comodos = comodos;
    }

    public Comodo getMaiorComodo() { return maiorComodo; }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public List<Comodo> getComodos() {
        return comodos;
    }

    public double getAreaTotalCasa() {
        return areaTotalCasa;
    }

    public double getValorCasa() { return valorCasa; }

    public  Casa converte(CasaDTO casa, CasaDAO dao) {
        return new Casa(dao.getList().size()+1, casa.getNome(), casa.getEndereco(), casa.getComodos());
    }

    public static CasaDTO converte(Casa casa) {
        return new CasaDTO(casa.getNome(),
                casa.getEndereco(),
                casa.getComodos(),
                casa.calcularAreaCasa(),
                casa.valorCasa(),
                casa.maiorComodo());
    }
}
