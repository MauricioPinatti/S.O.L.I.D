package dip_principio_inversao_dependencia.solucao;

import srp_principio_responsabilidade_unica.violacao.Pedido;

public class ProcessaPedido {

    private BancoDadosRepository dbRepo;

    private EnvioEmailRepository mailRepo;

    public ProcessaPedido(BancoDadosRepository dbRepo, EnvioEmailRepository mailRepo) {
        this.dbRepo = dbRepo;
        this.mailRepo = mailRepo;
    }

    public void processar(Pedido pedido) {
        // Regra de negócio processar pedido
        System.out.println("Regra de negócio ao processar pedido...");
        pedido.setNomeCliente("Maurício");
        pedido.setEmailCliente("mauricio@gmail.com");
        pedido.setId(47);

        dbRepo.salvar(pedido);

        mailRepo.enviarEmailConfirmacao(pedido);
    }
}
