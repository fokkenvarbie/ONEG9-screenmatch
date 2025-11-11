package br.com.alura.screenmatch.calculos;

public class FiltroRecomendacao {
    private String recomendacao;

    public void filtra(Classificacao classificacao){
        if (classificacao.getClassificacao() >= 4) {
            System.out.println("Está entre os preferidos do momento!");
        } else if (classificacao.getClassificacao() >=3){
            System.out.println("Muito bem avaliado no momento!");
        } else {
            System.out.println("Coloque na sua watchlist para assistir depois!");
        }
    }
}
