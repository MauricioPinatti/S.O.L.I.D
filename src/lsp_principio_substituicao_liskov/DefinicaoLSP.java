package lsp_principio_substituicao_liskov;

public class DefinicaoLSP {
    /*
        Princípio da Substituição de Liskov

        Quem propôs o Princípio da Substituição de Liskov, de maneira formal e matemática, foi Bárbara Loskov.

        No entanto, Robert Martin deu uma definição mais simples para ele: “Classes derivadas (ou classes-filhas)

        devem ser capazes de substituir suas classes-base (ou classes-mães)”.

        Ou seja, uma classe-filha deve ser capaz de executar tudo que sua classe-mãe faz.

        Esse princípio se conecta com o polimorfismo e reforça esse pilar da POO.

        É importante notar também que, ao entendermos esse princípio, passamos a nos atentar mais para o código:

        caso um método de uma classe-filha tenha um retorno muito diferente do da classe-mãe,

        ou lance uma exceção, por exemplo, já dá para perceber que algo está errado.

        Se no seu programa você tem uma abstração que se parece com um pato, faz o som de um pato,

        nada como um pato, mas precisa de baterias, sua abstração está equivocada.

        Imagine que, no seu projeto, você tem uma classe Pato, e uma classe filha dela, PatoBorracha.

        Se em uma parte do código você precisar usar um objeto Pato, mas usar um PatoBorracha no seu lugar, pode ter problemas.

        Isso fere o princípio de substituição de Liskov, já que não conseguimos substituir um pai por um filho completamente.
    */

}
