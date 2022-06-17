import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class Exercicio1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Set<Integer> idsAlunos = new HashSet<>();

        System.out.print("Quantos alunos para o curso A?: ");
        int cursoA = scanner.nextInt();
        for (int i = 0; i < cursoA; i++) {
            int idAluno = scanner.nextInt();
            idsAlunos.add(idAluno);
        }

        System.out.print("Quantos alunos para o curso B?: ");
        int cursoB = scanner.nextInt();
        for (int i = 0; i < cursoB; i++) {
            int idAluno = scanner.nextInt();
            idsAlunos.add(idAluno);
        }

        System.out.print("Quantos alunos para o curso C?: ");
        int cursoC = scanner.nextInt();
        for (int i = 0; i < cursoC; i++) {
            int idAluno = scanner.nextInt();
            idsAlunos.add(idAluno);
        }

        System.out.printf("Total de estudantes: %d", idsAlunos.size());

        scanner.close();
    }
}
