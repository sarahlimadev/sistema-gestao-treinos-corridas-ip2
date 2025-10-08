package beans;

import java.time.LocalDateTime;

public abstract class Treino {
    private LocalDateTime dataHora;
    private double tempo;
    private Pessoa pessoa;
    private double met;


    public Treino(LocalDateTime dataHora, double tempo, Pessoa pessoa, double met) {
        this.dataHora = dataHora;
        this.tempo = tempo;
        this.pessoa = pessoa;
        this.met = met;
    }
    

    public LocalDateTime getDataHora() {
        return dataHora;
    }




    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }




    public double getTempo() {
        return tempo;
    }




    public void setTempo(double tempo) {
        this.tempo = tempo;
    }




    public Pessoa getPessoa() {
        return pessoa;
    }




    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }




    public double getMet() {
        return met;
    }




    public void setMet(double met) {
        this.met = met;
    }




    public double calcularCalorias(){
        return this.met * this.pessoa.getPeso() * this.pessoa.getAltura();
    }

}
