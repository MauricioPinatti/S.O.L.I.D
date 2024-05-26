package ocp_principio_aberto_fechado.solucao;

import srp_principio_responsabilidade_unica.solucao.ProcessaPedido;
import srp_principio_responsabilidade_unica.violacao.Pedido;

public class ProcessaPedidoComVerificacao extends ProcessaPedido {


    public void processar(Pedido pedido) {
        if (!pedido.possuiItens()) {
            throw new RuntimeException("não é possivel continuar! Pedido sem itens.");
        }

        super.processar(pedido);

        if (!pedido.isValid()) {
            throw new RuntimeException("Não é possivel continuar! Pedido sem Id.");
        }
    }
}
