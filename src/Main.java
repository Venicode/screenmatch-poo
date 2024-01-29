import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.models.Episodio;
import br.com.alura.screenmatch.models.Filme;
import br.com.alura.screenmatch.models.Serie;

public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O Poderoso Chefão");
        meuFilme.setAnoLancamento(1972);
        meuFilme.setDuracaoMinutos(175);
        meuFilme.exibeFichaTecnica();
        meuFilme.registroAvaliacoes(9);
        meuFilme.registroAvaliacoes(10);
        meuFilme.registroAvaliacoes(9.5);
        System.out.println("Média de avaliação: " + meuFilme.retornaMediaAvaliacoes());
        System.out.println("Total de avaliações: " + meuFilme.getQtdAvaliacao());

        Filme meuFilme2 = new Filme();
        meuFilme2.setNome("Kill Bill");
        meuFilme2.setAnoLancamento(1972);
        meuFilme2.setDuracaoMinutos(175);
        meuFilme2.exibeFichaTecnica();
        meuFilme.registroAvaliacoes(9);
        meuFilme.registroAvaliacoes(10);
        meuFilme.registroAvaliacoes(9.5);

        Serie novaSerie = new Serie();
        novaSerie.setNome("Game of Thrones");
        novaSerie.setTemporadas(8);
        novaSerie.setEpisodiosPorTemporada(7);
        novaSerie.setMinutosPorEpisodio(60);
        novaSerie.setAnoLancamento(2011);
        novaSerie.exibeFichaTecnica();
        System.out.println("Duração em minutos: " + novaSerie.getDuracaoMinutos());

        CalculadoraDeTempo calculadoraDeTempo = new CalculadoraDeTempo();
        calculadoraDeTempo.somaTotal(meuFilme);
        calculadoraDeTempo.somaTotal(meuFilme2);
        calculadoraDeTempo.somaTotal(novaSerie);
        System.out.println(calculadoraDeTempo.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(novaSerie);
        episodio.setTotalVisualizacao(50);
        filtro.filtra(episodio);
    }
}
