package desafio.aplicacao;

import desafio.entidades.Venda;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        String caminho = "D:\\Cursos\\DevSuperiorJavaExercicios\\" +
                "13-ProgramacaoFuncionalExpressoesLambda\\src\\desafio\\base-de-dados.csv";

        try (BufferedReader reader = new BufferedReader(new FileReader(caminho))) {
            List<Venda> vendas = new ArrayList<>();

            String linha = reader.readLine();
            while (linha != null) {
                String[] vetor = linha.split(",");
                int mes = Integer.parseInt(vetor[0]);
                int ano = Integer.parseInt(vetor[1]);
                String vendedor = vetor[2];
                int itens = Integer.parseInt(vetor[3]);
                double total = Double.parseDouble(vetor[4]);
                vendas.add(new Venda(mes, ano, vendedor, itens, total));
                linha = reader.readLine();
            }

            List<Venda> cincoMaioresVendasDe2016 = vendas
                    .stream()
                    .filter(venda -> venda.getAno() == 2016)
                    .sorted((o1, o2) -> o2.precoMedio().compareTo(o1.precoMedio())).limit(5).toList();
            cincoMaioresVendasDe2016.forEach(System.out::println);

            double valorTotalDeVendasDoLogan = vendas
                    .stream()
                    .filter(venda -> venda.getMes() == 1 && venda.getVendedor().equals("Logan") ||
                            venda.getMes() == 7 && venda.getVendedor().equals("Logan"))
                    .map(Venda::getTotal)
                    .reduce(0.0, Double::sum);

            System.out.printf("Valor total vendido pelo vendedor Logan nos meses 1 e 7 = %.2f", valorTotalDeVendasDoLogan);

        } catch (FileNotFoundException e) {
            System.out.printf("Erro: %s", e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
