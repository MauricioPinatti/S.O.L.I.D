package ocp_principio_aberto_fechado.violacao.terceiroexemplo;

public class Main {

    public static void main(String[] args) {
        var quadrado = new FormaGeometrica();
        quadrado.Tipo = Formas.RETANGULO;
        quadrado.Largura = 50;
        quadrado.Altura = 50;
        var area = quadrado.CalcularArea(quadrado);

        System.out.println("Área quadrado: " + area);

        var circulo = new FormaGeometrica();
        circulo.Tipo = Formas.CIRCULO;
        circulo.Raio = 30;
        var areaCirculo = circulo.CalcularArea(circulo);

        System.out.println("Área circulo: " + areaCirculo);

    }
}
