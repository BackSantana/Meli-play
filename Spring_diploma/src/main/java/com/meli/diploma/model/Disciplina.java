package com.meli.diploma.model;

import javax.annotation.processing.Generated;
import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
public class Disciplina {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotEmpty
    @Size(min = 8, max = 50, message = "O nome deve ter tamanho minimo de 8 e máximo de 50")
    @Pattern(regexp = "^([a-zA-Z ]+\\\\s)*[a-zA-Z ]+$")
    private String nome;
    @Min(value = 0, message = "Nota minima é 0")
    @Max(value = 10, message = "Nota maxima é 10")
    private double nota;

    public Disciplina(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public Disciplina() {

    }

    public String getNome() {
        return nome;
    }

    public double getNota() {
        return nota;
    }
}
