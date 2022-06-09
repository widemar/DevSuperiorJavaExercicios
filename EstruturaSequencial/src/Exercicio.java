import java.util.Locale;

public class Exercicio {
    public static void main(String[] args) {
        String produto1 = "Computador";
        String produto2 = "Mesa de trabalho";

        int idade = 30;
        int codigo = 5290;
        char genero = 'M';

        double preco1 = 2100.0;
        double preco2 = 650.50;
        double medida = 53.234567;

        System.out.println("Produtos");
        System.out.printf("%s, qual o preço R$%.2f\n", produto1, preco1);
        System.out.printf("%s, qual o preço R$%.2f\n", produto2, preco2);
        System.out.println();
        System.out.printf("Recorde: %d anos, código %d e gênero: %c \n", idade, codigo, genero);
        System.out.println();
        System.out.printf("Medida com oito casas decimais: %.8f\n", medida);
        System.out.printf("Três casas decimais arredondadas: %.3f\n", medida);
        Locale.setDefault(Locale.US);
        System.out.printf("Ponto decimal dos EUA: %.3f", medida);
    }
}
