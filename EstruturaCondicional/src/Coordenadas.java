import java.util.Locale;
import java.util.Scanner;

public class Coordenadas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Valor de X: ");
        double x = scanner.nextDouble();

        System.out.print("Valor de Y: ");
        double y = scanner.nextDouble();

        String mensagem;
        if (x == 0 && y == 0) mensagem = "Origem";
        else if (x > 0 && y > 0) mensagem = "Q1";
        else if (x < 0 && y > 0) mensagem = "Q2";
        else if (x < 0 && y < 0) mensagem = "Q3";
        else if (x > 0 && y < 0) mensagem = "Q4";
        else if (x == 0) mensagem = "Eixo Y";
        else mensagem = "Eixo X";

        System.out.println(mensagem);

        scanner.close();
    }
}
