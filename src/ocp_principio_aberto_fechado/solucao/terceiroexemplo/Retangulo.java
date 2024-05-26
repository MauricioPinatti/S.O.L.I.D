package ocp_principio_aberto_fechado.solucao.terceiroexemplo;

public class Retangulo extends FormaGeometrica {

    public double Largura;
    public double Altura;

    public Retangulo(double largura, double altura) {
        Largura = largura;
        Altura = altura;
    }

    @Override
    public double CalcularArea() {
        return Largura * Altura;
    }
}
