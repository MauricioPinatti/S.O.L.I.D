package lsp_principio_substituicao_liskov.violacao;

import lsp_principio_substituicao_liskov.solucao.Cliente;

import java.time.LocalDateTime;

public class ClienteAlvo extends Cliente {

    public String Nome;
    public LocalDateTime DataCadastro;

    public ClienteAlvo(String nome, LocalDateTime dataCadastro) {
        Nome = nome;
        DataCadastro = dataCadastro;
    }

    @Override
    public boolean ClientePremium() {
        // ainda nao é um cliente e não deve ter data de cadastro.
        throw new RuntimeException("Ainda não é um cliente ");
    }
}
