package com.meli.diploma.form;

import com.meli.diploma.model.Disciplina;
import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;;
import java.util.List;

public class AlunoForm {
    @NotEmpty
    @Size(min = 8, max = 50, message = "O nome deve ter tamanho minimo de 8 e máximo de 50")
    @Pattern(regexp = "^([a-zA-Z ]+\\\\s)*[a-zA-Z ]+$")
    private String nome;
    @Valid
    private List<Disciplina> disciplinas;

   public AlunoForm(){}

    public String getNome() {
        return nome;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }
}
