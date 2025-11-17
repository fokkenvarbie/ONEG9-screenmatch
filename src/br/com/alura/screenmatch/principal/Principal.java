package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculos.CalculadoraMaratona;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme alice = new Filme("Alice no País das Maravilhas", 2010);
        alice.setDuracaoEmMinutos(108);
        alice.exibeFichaTecnica();
        System.out.println("Duração: " + alice.getDuracaoEmMinutos());

        alice.avalia(7);
        alice.avalia(8);
        alice.avalia(7);
        System.out.println("Total de avaliações: " + alice.getTotalDeAvaliacoes());
        System.out.println("Média das avaliações: " + alice.retornaMedia());

        Filme coraline = new Filme("Coraline e o Mundo Secreto", 2009);
        coraline.setDuracaoEmMinutos(100);
        coraline.exibeFichaTecnica();
        System.out.println("Duração: " + coraline.getDuracaoEmMinutos());

        coraline.avalia(8);
        coraline.avalia(8);
        coraline.avalia(10);
        System.out.println("Total de avaliações: " + coraline.getTotalDeAvaliacoes());
        System.out.println("Média das avaliações: " + coraline.retornaMedia());

        Serie gameOfThrones = new Serie("Game of Thrones", 2011);
        gameOfThrones.setTemporadas(8);
        gameOfThrones.exibeFichaTecnica();
        System.out.println("Temporadas: " + gameOfThrones.getTemporadas());
        gameOfThrones.setEpisodiosPorTemporada(10);
        System.out.println("Episódios por temporada: " + gameOfThrones.getEpisodiosPorTemporada());
        gameOfThrones.setMinutosPorEpisodio(60);
        System.out.println("Duração por episódio: " + gameOfThrones.getMinutosPorEpisodio());

        gameOfThrones.avalia(9);
        gameOfThrones.avalia(10);
        gameOfThrones.avalia(10);
        gameOfThrones.avalia(8);
        gameOfThrones.avalia(10);
        System.out.println("Total de avaliações: " + gameOfThrones.getTotalDeAvaliacoes());
        System.out.println("Média das avaliações: " + gameOfThrones.retornaMedia());


        CalculadoraMaratona calculadora = new CalculadoraMaratona();
        calculadora.inclui(alice);
        calculadora.inclui(coraline);
        calculadora.inclui(gameOfThrones);
        System.out.println("Tempo necessário para maratonar: " + calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(alice);
        filtro.filtra(coraline);
        filtro.filtra(gameOfThrones);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(alice);
        listaDeFilmes.add(coraline);
        System.out.println("Tamanho da lista de filmes: " + listaDeFilmes.size());
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
        System.out.println("toString do filme: " + listaDeFilmes.get(0).toString());

        ArrayList<Serie> listaDeSeries = new ArrayList<>();
        listaDeSeries.add(gameOfThrones);
        System.out.println("Tamanho da lista de séries: " + listaDeSeries.size());
        System.out.println("Primeira série: " + listaDeSeries.get(0).getNome());
        System.out.println(listaDeSeries);
        System.out.println("toString da série: " + listaDeSeries.get(0).toString());

    }
}
