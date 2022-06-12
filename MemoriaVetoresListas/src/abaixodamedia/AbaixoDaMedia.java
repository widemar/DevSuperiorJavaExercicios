package abaixodamedia;

import java.util.Locale;
import java.util.Scanner;

public class AbaixoDaMedia {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int qtdDeElementos = scanner.nextInt();

        double[] vetor = new double[qtdDeElementos];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = scanner.nextDouble();
        }

        double soma = 0.0;
        for (double v : vetor) {
            soma += v;
        }

        double media = soma / vetor.length;

        System.out.printf("Media do vetor = %.3f\n", media);
        System.out.println("Elementos abaixo da média: ");
        for (double v : vetor) {
            if (v < media) {
                System.out.println(v);
            }
        }

        scanner.close();
    }
}
