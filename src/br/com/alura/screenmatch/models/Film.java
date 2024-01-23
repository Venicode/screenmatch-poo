package br.com.alura.screenmatch.models;

public class Film {
    private String nome;
    private int anoLancamento;
    boolean incluidoPlano;
    private double somaAvaliacao;
    private int qtdAvaliacao;
    private int duracaoMinutos;

    //Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public void setIncluidoPlano(boolean incluidoPlano) {
        this.incluidoPlano = incluidoPlano;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }

    //Getters
    public String getNome(){
        return nome;
    }
    public int getAnoLancamento(){
        return anoLancamento;
    }
    public int getDuracaoMinutos(){
        return duracaoMinutos;
    }
    public int getQtdAvaliacao(){
        return qtdAvaliacao;
    }

    //Methods
    public void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoLancamento);
        System.out.println("Duração em minutos: " + duracaoMinutos);
    }
    public void registroAvaliacoes(double nota){
        somaAvaliacao += nota;
        qtdAvaliacao++;
    }
    public double retornaMediaAvaliacoes(){
        return somaAvaliacao/qtdAvaliacao;
    }

}
