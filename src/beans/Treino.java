package beans;

import java.time.LocalDateTime;

public abstract class Treino {
    private String id;
    private String tipo;
    private double met;
    private LocalDateTime datahora;


    public Treino(String id, String tipo, LocalDateTime datahora) {
        this.id = id;
        this.tipo = tipo;
        this.datahora = datahora;
    }


    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
    }


    public String getTipo() {
        return tipo;
    }


    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    public LocalDateTime getDatahora() {
        return datahora;
    }


    public void setDatahora(LocalDateTime datahora) {
        this.datahora = datahora;
    }

    
    public double calcularCalorias(Pessoa pessoa){
        return met * pessoa.getPeso() * pessoa.getAltura();
    }
}
