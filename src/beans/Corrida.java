package beans;

import java.time.LocalDateTime;

public class Corrida extends Treino {
    private String id;
    private double distancia;


    public Corrida(LocalDateTime dataHora, double tempo, Pessoa pessoa, double met, String id, double distancia) {
        super(dataHora, tempo, pessoa, met);
        this.id = id;
        this.setDistancia(distancia);
    }


    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
    }


    public double getDistancia() {
        return distancia;
    }


    public void setDistancia(double distancia) {
        if (distancia > 0){
            this.distancia = distancia;
        }
        else{
            throw new IllegalArgumentException("Dado inválido (distância negativa)!");
        }
    }

    
    
}
