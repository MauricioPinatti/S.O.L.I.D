package ocp_principio_aberto_fechado.solucao.segundoexemplo;

import ocp_principio_aberto_fechado.violacao.segundoexemplo.Exame;

public interface AprovaExame {
    void aprovarSolicitacaoExame(Exame exame);

    boolean verificaCondicoesExame(Exame exame);
}
