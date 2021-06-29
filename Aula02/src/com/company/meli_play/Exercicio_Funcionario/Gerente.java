package com.company.meli_play.Exercicio_Funcionario;

import java.math.BigDecimal;

public class Gerente extends Funcionario implements IBonificacao{

    public Gerente(String nome, String cpf, BigDecimal salario, int horasTrabalhadas, Departamento departamento, int horasDescanso) {
        super(nome, cpf, salario, horasTrabalhadas, departamento, horasDescanso);
    }

    @Override
    public BigDecimal pagarSalario() {
        return getBonificacao().add(getSalario());
    }

    @Override
    public BigDecimal getBonificacao() {
        return getSalario().multiply(new BigDecimal("0.12"));
    }
}
