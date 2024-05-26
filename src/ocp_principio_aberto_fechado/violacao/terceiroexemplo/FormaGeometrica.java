package ocp_principio_aberto_fechado.violacao.terceiroexemplo;

public class FormaGeometrica {
    public Formas Tipo;
    public double Largura;
    public double Altura;
    public double Raio;

    public double CalcularArea(FormaGeometrica formaGeometrica) {
        double Area = 0;
        //retangulo
        if (Formas.RETANGULO == formaGeometrica.Tipo) {
            Area = formaGeometrica.Largura * formaGeometrica.Altura;
        } else if (Formas.CIRCULO == formaGeometrica.Tipo) {
            Area = formaGeometrica.Raio * formaGeometrica.Raio * Math.PI;
        }
        return Area;
    }

    @Override
    public String toString() {
        return "FormaGeometrica{" +
                "Tipo=" + Tipo +
                ", Largura=" + Largura +
                ", Altura=" + Altura +
                ", Raio=" + Raio +
                '}';
    }
}
