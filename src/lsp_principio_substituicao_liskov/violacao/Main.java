package lsp_principio_substituicao_liskov.violacao;

import lsp_principio_substituicao_liskov.solucao.Cliente;

public class Main {

    public static void main(String[] args) {

        /*Viola o principio de Liskov pois Cliente Alvo ainda nao é cliente e não deve herdar cliente!
        Esse principio ajuda exatamente nessa verificação da modelagem, se faz sentido ser extendida
        a classe base pode estar forçando , ou a classe herdada nao estar nessa familia
         */

        Cliente cliente = new ClienteAlvo("Mauricio", null);
        var premium = cliente.ClientePremium();
        System.out.println(premium);

    }
}
