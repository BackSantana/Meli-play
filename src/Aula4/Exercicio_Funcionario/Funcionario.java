package Aula4.Exercicio_Funcionario;

public class Funcionario {

    private String nome;
    private String cpf;
    private double salario;
    private double horasTrabalhadas;

    public Funcionario(String nome, String cpf, double salario, double horasTrabalhadas) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getBonificacao() {
        return this.salario * 0.05;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public double getSalario() {
        return salario;
    }
}