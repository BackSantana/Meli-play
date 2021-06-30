package com.company.meli_play;

/*
    Partindo da classe StringUtil (que usamos para resolver Radix Sort), agregar os seguintes métodos estáticos:
    public static String rpad (String s, char c, int n); idem lpad, mas adicionando caracteres à direita.
    public static String ltrim (String s); Retorna uma string idêntica a s, mas sem espaços à esquerda.
    public static String rtrim (String s); idem ltrim, mas sem espaços à direita.
    public static String trim(String s);  idem lpad, mas sem espaços à direita ou à esquerda.
    public static int indexOfN (String s, char c, int n); Retorna a posição da enésima ocorrência do caractere c em s,
    ou -1 se s não contiver c. Por exemplo, se s = "John | Paul | George | Ringo", c = ‘|’ e n = 2, a função deve retornar
    a posição da segunda ocorrência do caractere ‘|’ (barra vertical) dentro da string s. Que, neste caso, é: 9.
     */
public class StringUtil_v2 {

    public static String rpad(String s, char c, int n) {
        StringBuilder string = new StringBuilder(s);
        for (int i = 0; i <= n; i++) {
            string.append(c);
        }
        return string.toString();
    }

    public static String ltrim(String s) {
        return s.replaceAll("^\\s+", "");
    }

    public static String Rtrim(String s) {
        return s.replaceAll("^\\s+", "");
    }

    public static String Trim(String s) {
        return s.strip();
    }

    public static int indexOfN(String s, char c, int n) {
        int index = 0;
        int contador = 0;
        String aux = String.valueOf(c);
        for (int i = 0; i <= s.length() - 1; i++) {
            if (!s.contains(aux))
                return 0;
            if (aux.equals(String.valueOf(s.charAt(i)))) {
                contador++;
            }
            if (contador == n) {
                return index = s.indexOf(aux, i);
            }
        }
        return 0;
    }

    public static int indexOfTrim(String s, char c, int n) {
        int index = 0;
        int contador = 0;
        s = s.replaceAll(" ", "");

        String aux = String.valueOf(c);
        for (int i = 0; i <= s.length() - 1; i++) {
            if (!s.contains(aux))
                return 0;
            if (aux.equals(String.valueOf(s.charAt(i)))) {
                contador++;
            }
            if (contador == n) {
                return index = s.indexOf(aux, i);
            }
        }
        return 0;
    }
}
