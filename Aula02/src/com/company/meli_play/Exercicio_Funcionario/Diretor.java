package com.company.meli_play.Exercicio_Funcionario;

import java.math.BigDecimal;

public class Diretor extends Funcionario {

    public Diretor(String nome, String cpf, BigDecimal salario, Departamento departamento, int horasDescanso) {
        super(nome, cpf, salario, departamento, horasDescanso);
    }

    @Override
    public BigDecimal pagarSalario() {
        return getSalario();
    }
}
