package isp_principio_segregação_interface.solucao;

public class SetorDatascience implements GerarRelatorioVendasExcel{
    @Override
    public void gerarExcel() {
        System.out.println("Show! Super útil pra mim");
    }
}
