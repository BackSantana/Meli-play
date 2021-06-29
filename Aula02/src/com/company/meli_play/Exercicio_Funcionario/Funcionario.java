package com.company.meli_play.Exercicio_Funcionario;

import java.math.BigDecimal;

public abstract class Funcionario {

    private String nome;
    private String cpf;
    private BigDecimal salario;
    private int horasTrabalhadas;
    private Departamento departamento;
    private int horasDescanso;

    public Funcionario(String nome, String cpf, BigDecimal salario, int horasTrabalhadas, Departamento departamento, int horasDescanso) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.horasTrabalhadas = horasTrabalhadas;
        this.departamento = departamento;
        this.horasDescanso = horasDescanso;
    }

    public Funcionario(String nome, String cpf, BigDecimal salario, Departamento departamento, int horasDescanso) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.horasTrabalhadas = horasTrabalhadas;
        this.departamento = departamento;
        this.horasDescanso = horasDescanso;
    }

    public abstract BigDecimal pagarSalario();

    public BigDecimal getSalario() {
        return salario;
    }
}