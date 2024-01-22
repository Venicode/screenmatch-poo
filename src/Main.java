public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "O Poderoso Chefão";
        meuFilme.anoLancamento = 1972;
        meuFilme.duracaoMinutos = 175;

        meuFilme.exibeFichaTecnica();

        meuFilme.registroAvaliacoes(9);
        meuFilme.registroAvaliacoes(10);
        meuFilme.registroAvaliacoes(9.5);

        System.out.println(meuFilme.somaAvaliacao);
        System.out.println(meuFilme.qtdAvaliacao);
        System.out.println(meuFilme.retornaMediaAvaliacoes());
    }
}
