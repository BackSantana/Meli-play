package Aula4;

/*
Crie uma classe Conta Corrente, com os métodos: depósito, saque, devolução e transferência.
A classe conterá um construtor padrão, um com parâmetros e outro que receberá uma conta corrente da qual copiará todos os seus dados.
Além disso, os métodos de acesso devem ser desenvolvidos para cada variável de instância da classe, desenvolvendo um método set e outro método get.
Por exemplo: se a classe tem uma variável double saldo, seus métodos de acesso serão: double getSaldo () e void setSaldo (double s)
Os protótipos dos métodos e construtores devem ser discutidos e projetados em equipe.
 */
public class ContaCorrente {
    private String nomeTitular;
    private double saldo;

    public ContaCorrente(ContaCorrente contaCorrente) {
        this.nomeTitular = contaCorrente.getNomeTitular();
        this.saldo = contaCorrente.getSaldo();
    }

    public ContaCorrente() {
    }

    public void depositar(double valor){
        saldo += valor;
    }

    public void saque(double valor){
        if(saldo <= valor)
            System.out.println("Valor inválido");
        else
            saldo -= valor;
    }

    public void devolucao(double valor){

    }

    public void tranferir(double valor, ContaCorrente contaCorrente){
        contaCorrente.depositar(valor);
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
