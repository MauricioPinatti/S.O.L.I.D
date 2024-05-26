package dip_principio_inversao_dependencia.solucao;

import srp_principio_responsabilidade_unica.violacao.Pedido;

public interface BancoDadosRepository {
    boolean salvar(Pedido pedido);
}
