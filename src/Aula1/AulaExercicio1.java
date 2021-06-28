package Aula1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AulaExercicio1 {

    public static void mostraPares(){
        System.out.println("Digite um número:");
        Scanner sc = new Scanner(System.in);

        int pares = sc.nextInt();
        int contador = 0;

        for (int i = 0; contador < pares; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                contador++;
            }
        }
    }

    public static void numerosMultiplos(int numero, int multi){
        int contador = 0;
        for (int i = 0; contador < numero; i++){
            if(i % multi == 0){
                System.out.println(i);
                contador++;
            }
        }
    }

    public static boolean numeroPrimo(int numero){
        if (numero == 0 || numero == 1 || numero == 4) {
            return false;
        }

        for(int i = 2; i < numero/2; i++) {
            if (numero % i == 0)
                return false;
        }
        return true;
    }

    public static void numerosPrimos(int numero){
        int contador = 0;
        for(int i = 0; contador < numero; i++){
            if(numeroPrimo(i)){
                System.out.println(i);
                contador++;
            }
        }
    }

    public static int[] numerosNaturais(int total, int quantidade, int numero){
        int count = 0;
        int test[] = new int[total];
        String auxNumero = String.valueOf(numero);
        char temp;

        for (int i = 0;;i++){
            String iAux = String.valueOf(i);
            int countAux = 0;
            for(int j = 0; j < iAux.length(); j++) {
                temp = String.valueOf(i).charAt(j);

                if (temp == auxNumero.charAt(0)) {
                    countAux++;
                }
                if(countAux == quantidade){
                    test[count] = i;
                    count++;
                    System.out.println(i);
                }
            }
            if (count >= total) {
                return test;
            }
        }
    }

    public List<String> natural(int n, int m, int d){
        List aux_array = new ArrayList<String>();
        int count = 0;
        long count_occours = 1;
        char b = Integer.toString(d).charAt(0);


        while(aux_array.size() <= n) {
            String number = Integer.toString(count);
            count_occours = number.chars().filter(x -> x == b).count();

            if(count_occours >= m) {
                aux_array.add(count);
            }
            count++;
        }

        return aux_array;
    }
}
