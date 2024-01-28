package br.com.alura.screenmatch.calculos;
import br.com.alura.screenmatch.models.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

    public void somaTotal(Titulo titulo){
        tempoTotal+=titulo.getDuracaoMinutos();
    }
}
