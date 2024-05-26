package dip_principio_inversao_dependencia.violacao;

import srp_principio_responsabilidade_unica.violacao.Pedido;

public class Main {

    public static void main(String[] args) {

        ProcessaPedido processaPedido = new ProcessaPedido();

        processaPedido.processar(new Pedido());

    }

}
