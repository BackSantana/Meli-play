package com.company.meli_play;

public class Main {
    public static void main (String[] args) {
        AulaExercicio2 aula02 = new AulaExercicio2();
        AulaExercicio1 aula01 = new AulaExercicio1();

        System.out.println("------------------ Exercício 1 - Em grupo ----------------");

        System.out.println("\n ------------------ Exercício 1 - Primeiros números pares ----------------");
        aula01.mostraPares();

        System.out.println("\n ------------------ Exercício 1 - Primeiros números multiplos ----------------");
        aula01.numerosMultiplos(5, 2);

        System.out.println("\n ------------------ Exercício 1 - Verifica se o número é primo ----------------");
        System.out.println(aula01.numeroPrimo(6));

        System.out.println("\n ------------------ Exercício 1 - Primeiros números primos ----------------");
        aula01.numerosPrimos(5);

        int[] result = aula01.numerosNaturais(5, 2,3);

        Integer[] array = {1,4,5,6,70,90,80,36,100,78};
        System.out.println("\n ------------------ Exercício 2 - Ordenação e reverso do vetor ------------------");
        System.out.println("\n Exercício 2 - Ordenação");
        aula02.ordenaArray(array);
        System.out.println("\n Exercício 2 - Reverso");
        aula02.arrayReverse(array);

        System.out.println("\n ------------------ Exercício 2 - Empresa X vs Y -  Crescimento ------------------");
        aula02.guerraStartup();

        System.out.println("\n ------------------ Exercício 2 - Super mercado -  valor total das compras ------------------");
        aula02.superMercado("Queijo", 20.0, 19, "n");
        aula02.superMercado("Limonada", 5.0, 10, "n");
        aula02.superMercado("Presunto", 8.0, 4, "n");
        aula02.superMercado("Pão", 5.0, 10, "S");
    }
}
