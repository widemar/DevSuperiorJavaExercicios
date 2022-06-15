import java.util.Locale;
import java.util.Scanner;

public class Quadrante {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        boolean coordenadaValida = true;
        while (coordenadaValida) {
            System.out.println("Digite os valores das coordenas X e Y: ");
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            String mensagem;
            if (x > 0 && y > 0) {
                mensagem = "Quadrante 1";
            } else if (x < 0 && y > 0) {
                mensagem = "Quadrante 2";
            } else if (x < 0 && y < 0) {
                mensagem = "Quadrante 3";
            } else if (x > 0 && y < 0) {
                mensagem = "Quadrante 4";
            } else {
                mensagem = "";
                coordenadaValida = false;
            }

            System.out.print(mensagem);
        }

        scanner.close();
    }
}
