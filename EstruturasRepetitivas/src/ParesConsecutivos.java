import java.util.Locale;
import java.util.Scanner;

public class ParesConsecutivos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        boolean diferenteDeZero = true;
        while (diferenteDeZero) {
            System.out.print("Digite um numero inteiro: ");
            int num = scanner.nextInt();

            if (num == 0) {
                diferenteDeZero = false;
            } else {
                int soma = 0;
                int contador = 0;
                int pares = num % 2 == 0 ? num : num + 1;
                while (contador < 5) {
                    soma += pares;
                    pares += 2;
                    contador++;
                }
                System.out.printf("Soma = %d\n", soma);
            }
        }

        scanner.close();
    }
}
