import java.util.Locale;
import java.util.Scanner;

public class NegativosMatriz {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual a quantidade de linhas da matriz? ");
        int linha = scanner.nextInt();
        System.out.print("Qual a quantidade de colunas da matriz? ");
        int coluna = scanner.nextInt();

        int[][] matriz = new int[linha][coluna];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("Elemento [%d,%d]: ", i, j);
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Valores Negativos:");
        for (int[] linhas : matriz) {
            for (int colunas : linhas) {
                if (colunas < 0) {
                    System.out.println(colunas);
                }
            }
        }

        scanner.close();
    }
}
