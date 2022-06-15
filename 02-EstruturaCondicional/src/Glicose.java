import java.util.Locale;
import java.util.Scanner;

public class Glicose {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a medida da glicose: ");
        double glicose = scanner.nextDouble();

        String mensagem;
        if (glicose <= 100) {
            mensagem = "Normal";
        } else if (glicose <= 140) {
            mensagem = "Elevado";
        } else {
            mensagem = "Diabetes";
        }

        System.out.println(mensagem);

        scanner.close();
    }
}
