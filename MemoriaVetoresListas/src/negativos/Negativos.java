package negativos;

import java.util.Locale;
import java.util.Scanner;

public class Negativos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int qtdDeNumeros = scanner.nextInt();

        int[] vetorNegativo = new int[qtdDeNumeros];

        for (int i = 0; i < vetorNegativo.length; i++) {
            System.out.print("Digite um número: ");
            int num = scanner.nextInt();
            vetorNegativo[i] = num;
        }

        System.out.println("Números negativos:");
        for (int j : vetorNegativo) {
            if (j < 0) {
                System.out.println(j);
            }
        }

        scanner.close();
    }
}
