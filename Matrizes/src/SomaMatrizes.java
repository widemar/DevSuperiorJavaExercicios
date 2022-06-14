import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class SomaMatrizes {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas linhas vai ter cada matriz? ");
        int linha = scanner.nextInt();
        System.out.print("Quantas colunas vai ter cada matriz? ");
        int coluna = scanner.nextInt();

        int[][] matrizA = new int[linha][coluna];
        int[][] matrizB = new int[linha][coluna];
        int[][] matrizC = new int[linha][coluna];

        System.out.println("Digite os valores da matriz A: ");
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                System.out.printf("Elemento [%d,%d]: ", i, j);
                matrizA[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Digite os valores da matriz B: ");
        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB[i].length; j++) {
                System.out.printf("Elemento [%d,%d]: ", i, j);
                matrizB[i][j] = scanner.nextInt();
            }
        }

        // Somando as matrizes
        for (int i = 0; i < matrizC.length; i++) {
            for (int j = 0; j < matrizC[i].length; j++) {
                matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }

        System.out.println("Matriz soma: ");
        for (int[] linhas : matrizC) {
            System.out.println(Arrays.toString(linhas));
        }


        scanner.close();
    }
}
