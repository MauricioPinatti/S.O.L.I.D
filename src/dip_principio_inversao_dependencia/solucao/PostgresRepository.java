package dip_principio_inversao_dependencia.solucao;

import srp_principio_responsabilidade_unica.violacao.ConexaoPostgres;
import srp_principio_responsabilidade_unica.violacao.Pedido;

public class PostgresRepository implements BancoDadosRepository{
    @Override
    public boolean salvar(Pedido pedido) {
        ConexaoPostgres dbConnection = new ConexaoPostgres("database.url");

        try {
            dbConnection.salvar(pedido);
        } catch (Exception e) {
            // log
            return false;
        }

        return true;
    }
}
