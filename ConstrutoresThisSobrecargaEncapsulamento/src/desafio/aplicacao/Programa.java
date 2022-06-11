package desafio.aplicacao;

import desafio.entidades.Campeao;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os dados do primeiro campeão:");
        System.out.print("Nome: ");
        String nomeCampeao1 = scanner.nextLine();
        System.out.print("Vida Inicial: ");
        int vidaCampeao1 = scanner.nextInt();
        System.out.print("Ataque: ");
        int ataqueCampeao1 = scanner.nextInt();
        System.out.print("Armadura: ");
        int armaduraCampeao1 = scanner.nextInt();

        Campeao campeao1 = new Campeao(nomeCampeao1, vidaCampeao1, ataqueCampeao1, armaduraCampeao1);

        System.out.println("Digite os dados do segundo campeão:");
        System.out.print("Nome: ");
        scanner.nextLine();
        String nomeCampeao2 = scanner.nextLine();
        System.out.print("Vida Inicial: ");
        int vidaCampeao2 = scanner.nextInt();
        System.out.print("Ataque: ");
        int ataqueCampeao2 = scanner.nextInt();
        System.out.print("Armadura: ");
        int armaduraCampeao2 = scanner.nextInt();

        Campeao campeao2 = new Campeao(nomeCampeao2, vidaCampeao2, ataqueCampeao2, armaduraCampeao2);

        System.out.print("Quantos turnos você deseja executar? ");
        int qtdDeTurnos = scanner.nextInt();

        for (int i = 1; i <= qtdDeTurnos; i++) {
            campeao1.levarDano(campeao2);
            campeao2.levarDano(campeao1);
            System.out.printf("Resultado do turno %d\n", i);
            campeao1.status();
            campeao2.status();
        }

        System.out.println("FIM DO COMBATE");

        scanner.close();
    }
}
