package maiorposicao;

import java.util.Locale;
import java.util.Scanner;

public class MaiorPosicao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int qtdDeNumeros = scanner.nextInt();

        double[] vetor = new double[qtdDeNumeros];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = scanner.nextDouble();
        }

        double maior = vetor[0];
        int posicaoMaior = 0;
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
                posicaoMaior = i;
            }
        }
        System.out.printf("Maior Valor: %.1f\n", maior);
        System.out.printf("Posicão do maior valor: %d", posicaoMaior);

        scanner.close();
    }
}
