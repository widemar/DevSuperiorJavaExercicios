import java.util.Locale;
import java.util.Scanner;

public class Experiencias {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos casos de teste serão digitados? ");
        int qtdCasos = scanner.nextInt();

        int somaCoelho = 0, somaRato = 0, somaSapo = 0;
        for (int i = 0; i < qtdCasos; i++) {
            System.out.print("Quantidade de cobaias: ");
            int qtdCobaias = scanner.nextInt();
            System.out.print("Tipo de cobaia: ");
            char tipoDeCobaia = scanner.next().toUpperCase().charAt(0);

            switch (tipoDeCobaia) {
                case 'C' -> somaCoelho += qtdCobaias;
                case 'R' -> somaRato += qtdCobaias;
                case 'S' -> somaSapo += qtdCobaias;
                default -> System.out.println("Cobaia Inválida");
            }
        }

        int totalDeCobaias = somaCoelho + somaRato + somaSapo;
        double percentualCoelhos = (double) somaCoelho / totalDeCobaias * 100;
        double percentualRatos = (double) somaRato / totalDeCobaias * 100;
        double percentualSapos = (double) somaSapo / totalDeCobaias * 100;
        System.out.println("Relatório final:".toUpperCase());
        System.out.printf("Total: %d cobaias\n", totalDeCobaias);
        System.out.printf("Total de coelhos: %d\n", somaCoelho);
        System.out.printf("Total de ratos: %d\n", somaRato);
        System.out.printf("Total de sapos: %d\n", somaSapo);
        System.out.printf("Percentual de coelhos: %.2f\n", percentualCoelhos);
        System.out.printf("Percentual de ratos: %.2f\n", percentualRatos);
        System.out.printf("Percentual de sapos: %.2f\n", percentualSapos);

        scanner.close();
    }
}
