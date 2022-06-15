import java.util.Locale;
import java.util.Scanner;

public class SenhaFixa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a senha: ");
        int senha = scanner.nextInt();

        while (senha != 2002) {
            System.out.print("Senha Inválida! tente novamente: ");
            senha = scanner.nextInt();
        }

        System.out.println("Acesso Permitido!");

        scanner.close();
    }
}
