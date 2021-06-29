package com.company.meli_play;

import com.company.meli_play.Exercicio_Funcionario.*;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        System.out.println("-------- Exercício Aula 2 --------");

        System.out.println("\n -------- Exercício Aula 2 - Conta Corrente --------");
        ContaCorrente contaCorrente = new ContaCorrente("Carlos Sérgio Santana");
        ContaCorrente contaCorrente1 = new ContaCorrente(contaCorrente);
        contaCorrente1.depositar(300);
        contaCorrente1.saque(300);

        System.out.println("\n -------- Exercício Aula 2 - Counter --------");
        Counter counter = new Counter(10);
        System.out.println(counter.aumentar());
        System.out.println(counter.aumentar(30));
        System.out.println(counter.diminuir());
        System.out.println(counter.getValor());

        System.out.println("\n -------- Exercício Aula 2 - Book --------");
        Book livro = new Book("O mundo fantastico de Carlos", 2, "Carlos Sérgio Santana Santos");
        System.out.println(livro.toString());

        System.out.println("\n -------- Exercício Aula 2 - Fração --------");
        Fracao fracao = new Fracao();
        fracao.soma(1,2,1);
        fracao.multiplicacao(1,2,1);

        System.out.println("\n -------- Exercício Aula 2 - Data --------");
        Data data = new Data("2021-06-27");
        System.out.println(data.verificaData());
        System.out.println(data.addDay());

        System.out.println("\n -------- Exercício Aula 2 - StringUtils --------");
        System.out.println(StringUtil_v2.indexOfN("John | Paul | George | Ringo", '|', 2));
        System.out.println(StringUtil_v2.indexOfTrim("John | Paul | George | Ringo", '|', 2));

        System.out.println("\n -------- Exercício Aula 2 - Funcionário --------");

        Funcionario analista = new Analista("Carlos",
                "47576528866",
                BigDecimal.valueOf(3200.00),
                40,
                Departamento.MERCADO_PAGO,
                0);

        Funcionario tecnico = new Analista("Sérgio",
                "47576528866",
                BigDecimal.valueOf(4000.00),
                40,
                Departamento.IT,
                4);

        Funcionario gerente = new Gerente("Santana",
                "47576528866",
                BigDecimal.valueOf(6000.00),
                36,
                Departamento.PRODUTO,
                4);

        Funcionario diretor = new Diretor("Santos",
                "47576528866",
                BigDecimal.valueOf(15000.00),
                Departamento.RECURSOS_HUMANOS,
                4);

        System.out.println("Salário analista : " + analista.pagarSalario());
        System.out.println("Salário técnico : "  + tecnico.pagarSalario());
        System.out.println("Salário gerente : "  + gerente.pagarSalario());
        System.out.println("Salário diretor : "  + diretor.pagarSalario());
    }
}