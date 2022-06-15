import java.util.Locale;
import java.util.Scanner;

public class Duracao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a duração em segundos: ");
        int duracao = scanner.nextInt();

        int horas = duracao / 3600;
        int minutos = (duracao - (3600 * horas)) / 60;
        int segundos = duracao - ((3600 * horas) + (60 * minutos));

        System.out.printf("%d:%d:%d", horas, minutos, segundos);

        scanner.close();
    }
}
