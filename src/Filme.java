public class Filme {
    String nome;
    int anoLancamento;
    boolean incluidoPlano;
    double somaAvaliacao;
    int qtdAvaliacao;
    int duracaoMinutos;

    void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoLancamento);
        System.out.println("Duração em minutos: " + duracaoMinutos);
    }
    void registroAvaliacoes(double nota){
        somaAvaliacao += nota;
        qtdAvaliacao++;
    }
    double retornaMediaAvaliacoes(){
        return somaAvaliacao/qtdAvaliacao;
    }
}
