package somavetores;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetores {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada vetor? ");
        int qtdDeNumeros = scanner.nextInt();

        int[] vetorA = new int[qtdDeNumeros];
        int[] vetorB = new int[qtdDeNumeros];
        int[] vetorResultante = new int[qtdDeNumeros];

        System.out.println("Digite os valores do vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = scanner.nextInt();
        }

        System.out.println("Digite os valores do vetor B: ");
        for (int i = 0; i < vetorB.length; i++) {
            vetorB[i] = scanner.nextInt();
        }

        for (int i = 0; i < vetorResultante.length; i++) {
            vetorResultante[i] = vetorA[i] + vetorB[i];
        }

        System.out.println("Vetor Resultante: ");
        for (int i : vetorResultante) {
            System.out.println(i);
        }

        scanner.close();
    }
}
