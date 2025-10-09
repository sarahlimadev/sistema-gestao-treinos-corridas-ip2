package beans;

import java.time.LocalDateTime;

public abstract class Treino {
    private LocalDateTime dataHora;
    private double tempo;
    private Pessoa pessoa;
    private double met;


    public Treino(LocalDateTime dataHora, double tempo, Pessoa pessoa, double met) {
        this.setDataHora(dataHora);
        this.setTempo(tempo);
        this.pessoa = pessoa;
        this.setMet(met);
    }
    

    public LocalDateTime getDataHora() {
        return dataHora;
    }


    public void setDataHora(LocalDateTime dataHora) {
        LocalDateTime dataHoraAtual = LocalDateTime.now();
        if (dataHora.isAfter(dataHoraAtual) || dataHora.isEqual(dataHoraAtual)){
            this.dataHora = dataHora;
        }
        else{
            throw new IllegalArgumentException("Data/Hora inválido");
        }
    }


    public double getTempo() {
        return tempo;
    }


    public void setTempo(double tempo) {
        if (tempo > 0){
            this.tempo = tempo;
        }
        else{
            throw new IllegalArgumentException("Dado inválido (tempo negativo)!");
        }
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
        if (met > 0){
            this.met = met;
        }
        else{
            throw new IllegalArgumentException("Dado inválido (MET negativo)!");
        }
    }

    public double calcularCalorias(){
        return this.met * this.pessoa.getPeso() * this.pessoa.getAltura();
    }

}
