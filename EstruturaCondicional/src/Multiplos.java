import java.util.Locale;
import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite dois números inteiros: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        String mensagem = num1 % num2 == 0 || num2 % num1 == 0 ? "São múltiplos" : "Não são múltiplos";

        System.out.println(mensagem);

        scanner.close();
    }
}
