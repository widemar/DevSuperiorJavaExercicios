package aprovados.aplicacao;

import aprovados.entidades.Aluno;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        List<Aluno> alunos = new ArrayList<>();

        System.out.print("Quantos alunos serão digitados: ");
        int qtdDeAlunos = scanner.nextInt();

        for (int i = 1; i <= qtdDeAlunos; i++) {
            System.out.printf("Digite nome, primeira e segunda nota do %d° aluno:\n", i);
            scanner.nextLine();
            String nome = scanner.nextLine();
            double nota1 = scanner.nextDouble();
            double nota2 = scanner.nextDouble();

            alunos.add(new Aluno(nome, nota1, nota2));
        }

        System.out.println("Alunos Aprovados:");
        for (Aluno aluno : alunos) {
            if (aluno.media() > 6.0) {
                System.out.println(aluno.getNome());
            }
        }

        scanner.close();
    }
}
