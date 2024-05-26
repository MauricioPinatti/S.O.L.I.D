package dip_principio_inversao_dependencia.violacao;

import srp_principio_responsabilidade_unica.violacao.Pedido;

public class ConexaoOracle {

    public ConexaoOracle(String dbUrl) {
        // Simulando criação de conexão no oracle
    }

    public void salvar(Pedido order) {
        System.out.println("Salvando pedido no ORACLE...");
        // Persistindo dados no banco real
    }

}