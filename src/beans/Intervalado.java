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
        this.setSeries(series);
        this.setRepeticoes(repeticoes);
        this.setIntervalor_rep(intervalor_rep);;
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
        if (series > 0){
            this.series = series;
        }
        else{
            throw new IllegalArgumentException("Dado inválido (series negativas)!");
        }
    }


    public int getRepeticoes() {
        return repeticoes;
    }


    public void setRepeticoes(int repeticoes) {
        if (repeticoes > 0){
            this.repeticoes = repeticoes;
        }
        else{
            throw new IllegalArgumentException("Dado inválido (repetições negativas)!");
        }
    }


    public int getIntervalor_rep() {
        return intervalor_rep;
    }


    public void setIntervalor_rep(int intervalor_rep) {
        if (intervalor_rep > 0){
            this.intervalor_rep = intervalor_rep;
        }
        else{
            throw new IllegalArgumentException("Dado inválido (intervalo negativo)!");
        }
    }

    
    
}
