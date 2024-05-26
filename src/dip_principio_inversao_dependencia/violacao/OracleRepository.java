package dip_principio_inversao_dependencia.violacao;

import srp_principio_responsabilidade_unica.violacao.Pedido;

public class OracleRepository {

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
