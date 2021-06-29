package com.company.meli_play.Exercicio_Funcionario;

import java.math.BigDecimal;

public class Tecnico extends Funcionario implements IBonificacao{

    public Tecnico(String nome, String cpf, BigDecimal salario, Departamento departamento, int horasDescanso) {
        super(nome, cpf, salario, departamento, horasDescanso);
    }

    @Override
    public BigDecimal pagarSalario() {
        return getBonificacao().add(getSalario());
    }

    @Override
    public BigDecimal getBonificacao() {
        return getSalario().multiply(new BigDecimal("0.05"));
    }
}
