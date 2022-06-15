import java.util.Locale;
import java.util.Scanner;

public class AcimaDiagonal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual a ordem da matriz? ");
        int tamanho = scanner.nextInt();

        int[][] matriz = new int[tamanho][tamanho];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("Elemento [%d,%d]: ", i, j);
                matriz[i][j] = scanner.nextInt();
            }
        }

        int soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (j > i) {
                    soma += matriz[i][j];
                }
            }
        }

        System.out.printf("Soma dos elementos acima da diagonal principal = %d", soma);

        scanner.close();
    }
}
