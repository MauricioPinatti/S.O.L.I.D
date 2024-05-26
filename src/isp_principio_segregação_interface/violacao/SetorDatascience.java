package isp_principio_segregação_interface.violacao;

public class SetorDatascience implements GerarRelatorioVendas{
    @Override
    public void gerarExcel() {
        System.out.println("Show! Super útil pra mim");
    }

    @Override
    public void gerarPDF() {
        System.out.println("Não,isso é muito inútil, não vou usar!");
    }
}
