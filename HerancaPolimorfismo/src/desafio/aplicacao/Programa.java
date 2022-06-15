package desafio.aplicacao;

import desafio.entidades.Licao;
import desafio.entidades.Tarefa;
import desafio.entidades.Video;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        List<Licao> list = new ArrayList<>();

        System.out.print("Quantas aulas tem nesse curso? ");
        int quantidadeDeAulas = scanner.nextInt();

        for (int i = 1; i <= quantidadeDeAulas; i++) {
            System.out.printf("Dados da %d° aula:\n", i);
            System.out.print("Conteúdo ou tarefa | c ou t | ");
            char tipoDeAula = scanner.next().toLowerCase().charAt(0);
            System.out.print("Título: ");
            scanner.nextLine();
            String titulo = scanner.nextLine();

            switch (tipoDeAula) {
                case 'c' -> {
                    System.out.print("Url do vídeo: ");
                    String url = scanner.nextLine();
                    System.out.print("Duração em segundos: ");
                    int duracao = scanner.nextInt();
                    list.add(new Video(titulo, url, duracao));
                }
                case 't' -> {
                    System.out.print("Descrição: ");
                    String descricao = scanner.nextLine();
                    System.out.print("Quantidade de questões: ");
                    int quantidadeDeQuestoes = scanner.nextInt();
                    list.add(new Tarefa(titulo, descricao, quantidadeDeQuestoes));
                }
                default -> System.out.println("Aula inválida");
            }
        }

        int soma = 0;
        for (Licao licao : list) {
            soma += licao.duracao();
        }

        System.out.printf("Duração total do curso = %d segundos", soma);

        scanner.close();
    }
}
