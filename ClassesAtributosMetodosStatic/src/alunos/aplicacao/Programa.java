package alunos.aplicacao;

import alunos.entidades.Aluno;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        Aluno aluno = new Aluno(nome);

        for (int i = 1; i <= 3; i++) {
            System.out.printf("Informe a nota %d: ", i);
            double nota = scanner.nextDouble();

            aluno.getNotas().add(nota);
        }

        System.out.println(aluno);

        scanner.close();
    }
}
