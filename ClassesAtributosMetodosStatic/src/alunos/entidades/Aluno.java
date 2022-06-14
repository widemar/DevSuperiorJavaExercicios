package alunos.entidades;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private final List<Double> notas;
    private String nome;

    public Aluno(String nome) {
        this.nome = nome;
        this.notas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Double> getNotas() {
        return notas;
    }

    public Double somaNotas() {
        double soma = 0;
        for (Double nota : notas) {
            soma += nota;
        }
        return soma;
    }

    public String situacaoDoAluno() {
        return somaNotas() >= 60 ?
                "Aprovado" :
                String.format("Reprovado\nFaltaram %.2f pontos", 60 - somaNotas());
    }

    @Override
    public String toString() {
        return String.format(
                "Nota final = %.2f\n%s",
                somaNotas(), situacaoDoAluno()
        );
    }
}
