package dip_principio_inversao_dependencia.solucao;

import srp_principio_responsabilidade_unica.violacao.Pedido;


public class Main {

    public static void main(String[] args) {

        PostgresRepository pgRepo = new PostgresRepository();
        OracleRepository oracleRepository = new OracleRepository();
        EnviarEmailConfirmacao sendMail = new EnviarEmailConfirmacao();

        Pedido pedido = new Pedido();

        ProcessaPedido orderProcessor = new ProcessaPedido(oracleRepository, sendMail);

        orderProcessor.processar(pedido);
    }
}
