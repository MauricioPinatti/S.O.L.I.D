package ocp_principio_aberto_fechado.violacao.segundoexemplo;

public class AprovaExame {

    public void aprovarSolicitacaoExame(Exame exame) {
        if (exame.tipo == Tipo.SANGUE) {
            if (verificaCondicoesExameSangue(exame))
                System.out.println("Exame sanguíneo aprovado!");
        } else if (exame.tipo == Tipo.RAIOX) {
            if (verificaCondicoesRaioX(exame))
                System.out.println("Raio X aprovado!");
        }

    }

    private boolean verificaCondicoesExameSangue(Exame exame) {
        //....
        return false;
    }

    private boolean verificaCondicoesRaioX(Exame exame) {
        //....
        return false;
    }
}