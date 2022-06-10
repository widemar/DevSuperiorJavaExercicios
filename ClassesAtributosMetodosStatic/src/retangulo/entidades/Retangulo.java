package retangulo.entidades;

public class Retangulo {
    private Double largura;
    private Double altura;

    public Retangulo(Double largura, Double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public Double getLargura() {
        return largura;
    }

    public void setLargura(Double largura) {
        this.largura = largura;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double area() {
        return largura * altura;
    }

    public Double perimetro() {
        return 2 * (largura + altura);
    }

    public Double diagonal() {
        return Math.sqrt(Math.pow(largura, 2) + Math.pow(altura, 2));
    }

    @Override
    public String toString() {
        return String.format(
                "Area = %.2f\nPerímetro = %.2f\nDiagonal = %.2f",
                area(), perimetro(), diagonal()
        );
    }
}
