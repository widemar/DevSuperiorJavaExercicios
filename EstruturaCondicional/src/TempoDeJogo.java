import java.util.Locale;
import java.util.Scanner;

public class TempoDeJogo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Hora Inicial: ");
        int horaInicial = scanner.nextInt();

        System.out.print("Hora Final: ");
        int horaFinal = scanner.nextInt();

        int duracaoDoJogo;
        if (horaInicial > horaFinal) {
            duracaoDoJogo = 24 - (horaInicial - horaFinal);
        } else if (horaInicial < horaFinal) {
            duracaoDoJogo = horaFinal - horaInicial;
        } else {
            duracaoDoJogo = 24 - horaInicial - horaFinal;
        }

        System.out.printf("O jogo durou %d hora(s)", duracaoDoJogo);

        scanner.close();
    }
}
