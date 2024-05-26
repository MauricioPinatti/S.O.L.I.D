package isp_principio_segregação_interface.solucao;


public class BackOffice implements GerarRelatorioVendasExcel, GerarRelatorioVendasPDF {
    @Override
    public void gerarExcel() {
        System.out.println("Show! Super útil pra mim");
    }

    @Override
    public void gerarPDF() {
        System.out.println("Show! Super útil pra mim");
    }
}
