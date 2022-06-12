package mediapares;

import java.util.Locale;
import java.util.Scanner;

public class MediaPares {
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

        double somaPar = 0.0;
        int contaPar = 0;
        for (double v : vetor) {
            if (v % 2 == 0) {
                somaPar += v;
                contaPar++;
            }
        }

        if (contaPar == 0) {
            System.out.println("Nenhum número par");
        } else {
            double mediaPares = somaPar / contaPar;
            System.out.printf("Media dos pares = %.1f", mediaPares);
        }

        scanner.close();
    }
}
