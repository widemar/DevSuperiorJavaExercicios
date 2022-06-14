import java.util.Locale;
import java.util.Scanner;

public class CadaLinha {
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

        System.out.println("Maior elemento de cada linha:");
        for (int[] linhas : matriz) {
            int maiorElemento = 0;
            for (int item : linhas) {
                if (item > maiorElemento) {
                    maiorElemento = item;
                }
            }
            System.out.println(maiorElemento);
        }

        scanner.close();
    }
}
