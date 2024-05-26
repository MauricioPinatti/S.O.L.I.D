package lsp_principio_substituicao_liskov.solucao;

import java.time.LocalDateTime;

public class ClienteContratado extends Cliente {

    public String Nome;
    public LocalDateTime DataCadastro;

    public ClienteContratado(String nome, LocalDateTime dataCadastro) {
        Nome = nome;
        DataCadastro = dataCadastro;
    }

    @Override
    public boolean ClientePremium() {

        return DataCadastro.getYear() < 2017;
    }
}
