package isp_principio_segregação_interface.violacao;

public class BackOffice implements GerarRelatorioVendas{
    @Override
    public void gerarExcel() {
        System.out.println("Show! Super útil pra mim");
    }

    @Override
    public void gerarPDF() {
        System.out.println("Show! Super útil pra mim");
    }
}
