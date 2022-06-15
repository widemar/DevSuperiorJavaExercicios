package cambio.utilitarios;

public class ConversorDeMoeda {
    private static final double IOF = 0.06;

    public static Double converter(double valorDoDolar, double qtdDeDolares) {
        return (valorDoDolar * qtdDeDolares) + (valorDoDolar * qtdDeDolares * IOF);
    }

}
