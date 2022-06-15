package numerospares;

import java.util.Locale;
import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int qtdDeNumeros = scanner.nextInt();

        int[] vetor = new int[qtdDeNumeros];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = scanner.nextInt();
        }

        int contaPar = 0;
        System.out.println("Números pares:");
        for (int i : vetor) {
            if (i % 2 == 0) {
                System.out.printf("%d ", i);
                contaPar++;
            }
        }

        System.out.printf("\nQuantidade de pares = %d", contaPar);

        scanner.close();
    }
}
