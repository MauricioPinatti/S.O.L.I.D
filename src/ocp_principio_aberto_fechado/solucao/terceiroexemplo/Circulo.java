package ocp_principio_aberto_fechado.solucao.terceiroexemplo;

public class Circulo extends FormaGeometrica {

    public double Raio;

    public Circulo(double raio) {
        Raio = raio;
    }

    @Override
    public double CalcularArea() {
        return Raio * Raio * Math.PI;
    }
}
