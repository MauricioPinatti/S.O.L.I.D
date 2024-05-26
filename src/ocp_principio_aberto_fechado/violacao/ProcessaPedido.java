package ocp_principio_aberto_fechado.violacao;

import srp_principio_responsabilidade_unica.solucao.EnviarEmailConfirmacao;
import srp_principio_responsabilidade_unica.solucao.PostgressRepository;
import srp_principio_responsabilidade_unica.violacao.Pedido;

public class ProcessaPedido {

    public void processar(Pedido pedido){

        if(!pedido.possuiItens()){
            throw new RuntimeException("Não é possivel continuar! Pedido sem itens");
        }

        PostgressRepository pgRepo = new PostgressRepository();
        EnviarEmailConfirmacao enviarEmail = new EnviarEmailConfirmacao();

        System.out.println("Regra de negócio ao processar pedido...");
        pedido.setNomeCliente("Maurício Pinatti");
        pedido.setEmailCliente("mauricio.pinatti@gmail.com");
        pedido.setId(50);

        pgRepo.salvar(pedido);

        enviarEmail.enviarEmailConfirmacao(pedido);

        if(!pedido.isValid()){
            throw new RuntimeException("Não é possivel continuar! Pedido sem Id");
        }
    }

}
