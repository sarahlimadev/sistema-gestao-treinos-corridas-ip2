package beans;

import java.time.LocalDateTime;

public class Intervalado extends Treino{
    private String id;
    private int series;
    private int repeticoes;
    private int intervalor_rep;


    public Intervalado(LocalDateTime dataHora, double tempo, Pessoa pessoa, double met, String id, int series,
            int repeticoes, int intervalor_rep) {
        super(dataHora, tempo, pessoa, met);
        this.id = id;
        this.series = series;
        this.repeticoes = repeticoes;
        this.intervalor_rep = intervalor_rep;
    }


    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
    }


    public int getSeries() {
        return series;
    }


    public void setSeries(int series) {
        this.series = series;
    }


    public int getRepeticoes() {
        return repeticoes;
    }


    public void setRepeticoes(int repeticoes) {
        this.repeticoes = repeticoes;
    }


    public int getIntervalor_rep() {
        return intervalor_rep;
    }


    public void setIntervalor_rep(int intervalor_rep) {
        this.intervalor_rep = intervalor_rep;
    }

    
    
}
