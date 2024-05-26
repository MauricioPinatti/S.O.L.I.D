package srp_principio_responsabilidade_unica.solucao;

import srp_principio_responsabilidade_unica.violacao.ConexaoPostgres;
import srp_principio_responsabilidade_unica.violacao.Pedido;

public class PostgressRepository {

    public boolean salvar(Pedido pedido){
        ConexaoPostgres dbConnection = new ConexaoPostgres("database.url");
        try{
            dbConnection.salvar(pedido);
        }catch (Exception e){
            System.out.println("Exception: " + e);
            return false;
        }
        return true;
    }
}
