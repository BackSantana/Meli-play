package com.company.meli_play.Exercicio_Funcionario;

import java.math.BigDecimal;

public class Analista extends Funcionario implements IBonificacao {

    public Analista(String nome, String cpf, BigDecimal salario, int horasTrabalhadas, Departamento departamento, int horasDescanso) {
        super(nome, cpf, salario, horasTrabalhadas, departamento, horasDescanso);
    }

    @Override
    public BigDecimal getBonificacao() {
        return getSalario().multiply( new BigDecimal("0.08"));
    }

    @Override
    public BigDecimal pagarSalario() {
        return getBonificacao().add(getSalario());
    }
}
