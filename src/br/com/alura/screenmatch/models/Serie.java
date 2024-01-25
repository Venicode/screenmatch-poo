package br.com.alura.screenmatch.models;

public class Serie extends Titulo{
    private int temporadas;
    private int episodiosPorTemporada;
    private boolean emProducao;
    private int minutosPorEpisodio;

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public boolean isEmProducao() {
        return emProducao;
    }

    public void setEmProducao(boolean emProducao) {
        this.emProducao = emProducao;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    @Override
    public int getDuracaoMinutos() {
        return temporadas * episodiosPorTemporada * minutosPorEpisodio;
    }
}
