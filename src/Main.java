import br.com.alura.screenmatch.models.Film;

public class Main {
    public static void main(String[] args) {
        Film meuFilme = new Film();
        meuFilme.setNome("O Poderoso Chefão");
        meuFilme.setAnoLancamento(1972);
        meuFilme.setDuracaoMinutos(175);
        meuFilme.exibeFichaTecnica();

        meuFilme.registroAvaliacoes(9);
        meuFilme.registroAvaliacoes(10);
        meuFilme.registroAvaliacoes(9.5);

        System.out.println("Média de avaliação: "+meuFilme.retornaMediaAvaliacoes());
        System.out.println("Total de avaliações: "+meuFilme.getQtdAvaliacao());
    }
}
