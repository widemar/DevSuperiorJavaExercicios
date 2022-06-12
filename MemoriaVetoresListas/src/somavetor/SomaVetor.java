package somavetor;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetor {
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

        double soma = 0;
        System.out.print("Valores: = ");
        for (double v : vetor) {
            soma += v;
            System.out.printf("%.1f ", v);
        }
        double media = soma / vetor.length;
        System.out.printf("\nSoma = %.2f\n", soma);
        System.out.printf("Média = %.2f\n", media);
        
        scanner.close();
    }
}
