import java.util.Locale;
import java.util.Scanner;

public class DentroFora {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int qtd = scanner.nextInt();

        int contaFora = 0, contaDentro = 0;
        for (int i = 0; i < qtd; i++) {
            System.out.print("Digite um número: ");
            int num = scanner.nextInt();

            if (num >= 10 && num <= 20) {
                contaDentro++;
            } else {
                contaFora++;
            }
        }

        System.out.printf("%d dentro\n", contaDentro);
        System.out.printf("%d fora", contaFora);

        scanner.close();
    }
}
