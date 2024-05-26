package ocp_principio_aberto_fechado.solucao.terceiroexemplo;

public class Main {

    public static void main(String[] args) {
        FormaGeometrica quadrado = new Retangulo(50, 50);
        var areaQuadrado = quadrado.CalcularArea();
        System.out.println("Área quadrado: " + areaQuadrado);

        FormaGeometrica circulo = new Circulo(30);
        var areaCirculo = circulo.CalcularArea();

        System.out.println("Área circulo: " + areaCirculo);

    }
}
