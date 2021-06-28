package Aula4;
import com.github.kiprobinson.bigfraction.BigFraction;

/*
Crie uma classe Fracao com métodos necessários para adicionar, subtrair, multiplicar e dividir frações.
Todos os métodos devem ser sobrecarregados para que também possam ser usados ​​para operar entre frações e números inteiros (por exemplo: ⅗ + 2 ou ⅝ * 4).
 */
public class Fracao {

    public void multiplicacao( int x, int y, int z, int s )
    {
        BigFraction a = BigFraction.valueOf(x,y);
        BigFraction b = BigFraction.valueOf(z,s);
        System.out.println(a.multiply(b));
    }

    public void multiplicacao( int x, int y, int z )
    {
        BigFraction a = BigFraction.valueOf(x,y);
        BigFraction b = BigFraction.valueOf(0,z);
        System.out.println(a.multiply(b));
    }

    public void divisao( int x, int y, int z, int s )
    {
        BigFraction a = BigFraction.valueOf(x,y);
        BigFraction b = BigFraction.valueOf(z,s);
        System.out.println(a.divide(b));
    }

    public void divisao( int x, int y, int z )
    {
        BigFraction a = BigFraction.valueOf(x,y);
        BigFraction b = BigFraction.valueOf(0,z);
        System.out.println(a.divide(b));
    }

    public void soma( int x, int y, int z, int s )
    {
        BigFraction a = BigFraction.valueOf(x,y);
        BigFraction b = BigFraction.valueOf(z,s);
        System.out.println(a.add(b));
    }

    public void soma( int x, int y, int z )
    {
        BigFraction a = BigFraction.valueOf(x,y);
        BigFraction b = BigFraction.valueOf(0,z);
        System.out.println(a.add(b));
    }

    public void subtrair( int x, int y, int z, int s )
    {
        BigFraction a = BigFraction.valueOf(x,y);
        BigFraction b = BigFraction.valueOf(z,s);
        System.out.println(a.subtract(b));
    }

    public void subtrair( int x, int y, int z )
    {
        BigFraction a = BigFraction.valueOf(x,y);
        BigFraction b = BigFraction.valueOf(0,z);
        System.out.println(a.subtract(b));
    }
}
