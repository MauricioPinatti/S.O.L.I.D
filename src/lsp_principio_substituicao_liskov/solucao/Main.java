package lsp_principio_substituicao_liskov.solucao;

import jdk.jshell.spi.ExecutionControl;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) throws ExecutionControl.NotImplementedException {
        // criamos um cliente(classe base) e instanciamos na classe derivada - Respeita o principio de Liskov
        Cliente cliente = new ClienteContratado("Maurício", LocalDateTime.now());
        var premium = cliente.ClientePremium();
        System.out.println("É cliente premium? : " + premium);
    }
}
