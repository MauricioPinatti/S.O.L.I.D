package srp_principio_responsabilidade_unica.solucao;

import srp_principio_responsabilidade_unica.violacao.Pedido;

public class Main {
    public static void main(String[] args) {


        ProcessaPedido processaPedido = new ProcessaPedido();
        Pedido pedido = new Pedido();
        processaPedido.processar(pedido);

    }
}