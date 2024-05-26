package dip_principio_inversao_dependencia.solucao;

import dip_principio_inversao_dependencia.violacao.ConexaoOracle;
import srp_principio_responsabilidade_unica.violacao.Pedido;

public class OracleRepository implements BancoDadosRepository{
    @Override
    public boolean salvar(Pedido pedido) {
        ConexaoOracle dbConnection = new ConexaoOracle("database.url");

        try {
            dbConnection.salvar(pedido);
        } catch (Exception e) {
            // log
            return false;
        }

        return true;
    }
}
