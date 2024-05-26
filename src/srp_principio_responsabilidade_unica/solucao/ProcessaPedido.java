package srp_principio_responsabilidade_unica.solucao;

import srp_principio_responsabilidade_unica.violacao.Pedido;

public class ProcessaPedido {


    public void processar(Pedido pedido) {
        PostgressRepository pgRepo = new PostgressRepository();
        EnviarEmailConfirmacao enviarEmail = new EnviarEmailConfirmacao();

        System.out.println("Regra de negócio ao processar pedido...");
        pedido.setNomeCliente("Maurício Pinatti");
        pedido.setEmailCliente("mauricio.pinatti@gmail.com");
        pedido.setId(50);

        pgRepo.salvar(pedido);

        enviarEmail.enviarEmailConfirmacao(pedido);
    }
}
