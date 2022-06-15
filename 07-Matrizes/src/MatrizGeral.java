import java.util.Locale;
import java.util.Scanner;

public class MatrizGeral {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual a ordem da matriz? ");
        int tamanho = scanner.nextInt();

        double[][] matriz = new double[tamanho][tamanho];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("Elemento [%d,%d]: ", i, j);
                matriz[i][j] = scanner.nextDouble();
            }
        }

        double somaPositivos = 0;
        for (double[] linhas : matriz) {
            for (double items : linhas) {
                if (items > 0) {
                    somaPositivos += items;
                }
            }
        }
        System.out.printf("Soma dos positivos: %.1f\n", somaPositivos);

        System.out.print("Escolha uma linha: ");
        int linha = scanner.nextInt();
        System.out.print("Linha escolhida: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == linha) {
                    System.out.printf("%.1f ", matriz[i][j]);
                }
            }
        }

        System.out.println();
        System.out.print("Escolha uma coluna: ");
        int coluna = scanner.nextInt();
        System.out.print("Coluna escolhida: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (j == coluna) {
                    System.out.printf("%.1f ", matriz[i][j]);
                }
            }
        }

        System.out.println();
        System.out.print("Diagonal principal: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (j == i) {
                    System.out.printf("%.1f ", matriz[i][j]);
                }
            }
        }

        System.out.println();
        System.out.println("Matriz alterada: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < 0) {
                    matriz[i][j] = Math.pow(matriz[i][j], 2);
                }
                System.out.printf("%.1f ", matriz[i][j]);
                if (j == matriz.length - 1) {
                    System.out.println();
                }
            }
        }
        scanner.close();
    }
}
