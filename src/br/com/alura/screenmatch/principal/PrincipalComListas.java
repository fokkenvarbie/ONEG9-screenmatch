package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme alice = new Filme("Alice no País das Maravilhas", 2010);
        alice.avalia(7);
        Filme coraline = new Filme("Coraline e o Mundo Secreto", 2009);
        coraline.avalia(9);
        Serie gameOfThrones = new Serie("Game of Thrones", 2011);
        gameOfThrones.avalia(10);

        List<Titulo> lista = new LinkedList<>();
        lista.add(alice);
        lista.add(coraline);
        lista.add(gameOfThrones);

        for (Titulo item: lista) {
            System.out.println(item.getNome());

            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação: " + filme.getClassificacao());
            }

            if (item instanceof Serie serie && serie.getClassificacao() > 2) {
                System.out.println("Classificação: " + serie.getClassificacao());
            }
        }

        List<String> buscaPorArtista = new LinkedList<>();
        buscaPorArtista.add("Pedro Pascal");
        buscaPorArtista.add("Nicolas Cage");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação:");
        System.out.println(buscaPorArtista);

        Collections.sort(lista);
        System.out.println("Lista de títulos ordenados:");
        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano de lançamento:");
        System.out.println(lista);
    }
}