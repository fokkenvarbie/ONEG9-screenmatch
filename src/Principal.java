import br.com.alura.screenmatch.calculos.CalculadoraMaratona;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme alice = new Filme();
        alice.setNome("Alice no País das Maravilhas");
        alice.setAnoDeLancamento(2010);
        alice.setDuracaoEmMinutos(108);
        alice.exibeFichaTecnica();
        System.out.println("Duração: " + alice.getDuracaoEmMinutos());

        alice.avalia(7);
        alice.avalia(8);
        alice.avalia(7);
        System.out.println("Total de avaliações: " + alice.getTotalDeAvaliacoes());
        System.out.println("Média das avaliações: " + alice.retornaMedia());

        Filme coraline = new Filme();
        coraline.setNome("Coraline e o Mundo Secreto");
        coraline.setAnoDeLancamento(2009);
        coraline.setDuracaoEmMinutos(100);
        coraline.exibeFichaTecnica();
        System.out.println("Duração: " + coraline.getDuracaoEmMinutos());

        coraline.avalia(8);
        coraline.avalia(8);
        coraline.avalia(10);
        System.out.println("Total de avaliações: " + coraline.getTotalDeAvaliacoes());
        System.out.println("Média das avaliações: " + coraline.retornaMedia());

        Serie gameOfThrones = new Serie();
        gameOfThrones.setNome("Game of Thrones");
        gameOfThrones.setAnoDeLancamento(2011);
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
    }
}
