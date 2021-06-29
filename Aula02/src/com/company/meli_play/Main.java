package com.company.meli_play;

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
    }
}