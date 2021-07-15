package com.meli.diploma.util;

import com.meli.diploma.dto.AlunoDTO;
import com.meli.diploma.form.AlunoForm;
import com.meli.diploma.model.Aluno;
import com.meli.diploma.model.Disciplina;
import com.meli.diploma.repository.AlunoRepository;
import com.meli.diploma.service.AlunoService;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CertificateServiceImplTest {

    @Mock
    AlunoRepository alunoRepository;
    @InjectMocks
    AlunoService alunoService;

    @Test
    public void deveSalvarUmDiploma(){
        Aluno aluno = carregarAluno();

        AlunoDTO alunoDTO = alunoService.obterDiploma(aluno);

        Mockito.verify(alunoRepository).save(aluno);
     }

     @Test
    public void deveProcurarUmAluno(){
         Aluno aluno = carregarAluno();

         Mockito.when(alunoRepository.findById(1l)).thenReturn(java.util.Optional.ofNullable(aluno));
         Aluno alunoRetorno = alunoService.getAluno(1);
         Assertions.assertEquals(aluno, alunoRetorno);
     }

     @Test
    public void deveRetornarMediaCorreta(){
         Aluno aluno = carregarAluno();

         alunoService.obterDiploma(aluno);
         double media = aluno.getdisciplinas().stream().mapToDouble(d -> d.getNota()).sum() / 3;

        Assertions.assertEquals(media, aluno.getMedia());
     }

    @Test
    public void deveRetornarMensagemParabens(){
        Aluno aluno = carregarAluno();

        AlunoDTO alunoDTO = alunoService.obterDiploma(aluno);

        String mensagem = "Parabéns, você foi aprovado(a)!";

        Assertions.assertEquals(mensagem, alunoDTO.getMensagem());
    }

    @Test
    public void deveRetornarMensagemReprovado(){
        Aluno aluno = carregarReprovado();

        AlunoDTO alunoDTO = alunoService.obterDiploma(aluno);

        String mensagem = "Você foi reprovado(a)!";

        Assertions.assertEquals(mensagem, alunoDTO.getMensagem());
    }

    public Aluno carregarAluno(){
        List<Disciplina> disciplinaListForm = new ArrayList<>();
        disciplinaListForm.add(new Disciplina("Matematica", 10));
        disciplinaListForm.add(new Disciplina("historia", 9));
        disciplinaListForm.add(new Disciplina("Geografia", 9));

        return new Aluno(1l,"Carlos Sergio Santana", disciplinaListForm);
    }

    public Aluno carregarReprovado(){
        List<Disciplina> disciplinaListForm = new ArrayList<>();
        disciplinaListForm.add(new Disciplina("Matematica", 9));
        disciplinaListForm.add(new Disciplina("historia", 5));
        disciplinaListForm.add(new Disciplina("Geografia", 5));

        return new Aluno(1l,"Carlos Sergio Santana", disciplinaListForm);
    }
}
