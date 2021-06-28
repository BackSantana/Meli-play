package Aula1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AulaExercicio2 {
   static double valorTotal = 0.0;

    public void ordenaArray(Integer[] array){
        List<Integer> arrayAux = Arrays.asList(array);
        Collections.sort(arrayAux);
        arrayAux.forEach(item -> System.out.print("[" +item+ "] "));
    }

    public void arrayReverse(Integer[] array){
        List<Integer> arrayAux = Arrays.asList(array);
        ordenaArray(array);
        System.out.println("\n" + "List reverse");
        Collections.reverse(arrayAux);
        arrayAux.forEach(item -> System.out.print("[" +item+ "] "));
    }

    public void guerraStartup(){
        double valorAtualX = 1.13;
        double valorAtualY = 18.4;
        double crescimentoX = 1.48;
        double crescimentoY = 0.32;

        for(int i = 2021; valorAtualX < valorAtualY; i++){
            valorAtualX += valorAtualX*crescimentoX;
            valorAtualY += valorAtualY*crescimentoY;
            System.out.printf("Empresa X - " + i + " Valor da empresa - %.2f %n", valorAtualX);
            System.out.printf("Empresa Y - " + i + " Valor da empresa - %.2f %n", valorAtualY);
        }
    }

    public void superMercado(String nomeProduto, double preco, int quantidade, String s_nFinalizarCompra){
        if (!s_nFinalizarCompra.toLowerCase().equals("s")){
            System.out.println( "Nome: " + nomeProduto + "\n" +
                                "Preço do produto: " + preco + "\n" +
                                "Quantidade : " + quantidade );
            valorTotal += (preco * quantidade);
        }
        System.out.println("Valor da compra: " + valorTotal + "\n");
    }
}
