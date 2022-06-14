import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class DiagonalNegativos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual a ordem da matriz? ");
        int tamanho = scanner.nextInt();

        int[][] matriz = new int[tamanho][tamanho];
        List<Integer> diagonaisPrincipais = new ArrayList<>();

        int contaNegativos = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("Elemento [%d,%d]: ", i, j);
                matriz[i][j] = scanner.nextInt();
                if (i == j) {
                    diagonaisPrincipais.add(matriz[i][j]);
                }
                if (matriz[i][j] < 0) {
                    contaNegativos++;
                }
            }
        }

        System.out.println("Diagonal principal:");
        for (Integer diagonalPrincipal : diagonaisPrincipais) {
            System.out.printf("%d ", diagonalPrincipal);
        }
        System.out.printf("Quantidade de negativos: %d", contaNegativos);

        scanner.close();
    }
}
