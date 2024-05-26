package ocp_principio_aberto_fechado.solucao.segundoexemplo;

import ocp_principio_aberto_fechado.violacao.segundoexemplo.Exame;

public class AprovaExameSangue implements AprovaExame{
    @Override
    public void aprovarSolicitacaoExame(Exame exame){
        if(verificaCondicoesExame(exame))
            System.out.println("Exame sanguíneo aprovado!");

    }
    @Override
    public boolean verificaCondicoesExame(Exame exame){
        //....
        return false;
    }
}
