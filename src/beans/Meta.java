package beans;

import java.time.LocalDate;

public class Meta {
    private String id;
    private String tipo;
    private LocalDate data_inicio;
    private LocalDate data_fim;
    private double objetivo;
    private String status;


    public Meta(String id, String tipo, LocalDate data_inicio, LocalDate data_fim, double objetivo, String status) {
        this.id = id;
        this.tipo = tipo;
        this.setData_inicio(data_inicio);
        this.setData_fim(data_fim);
        this.setObjetivo(objetivo);
        this.status = status;
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


    public LocalDate getData_inicio() {
        return data_inicio;
    }


    public void setData_inicio(LocalDate data_inicio) {
        LocalDate atual = LocalDate.now();
        if (data_inicio.isAfter(atual) || data_inicio.isEqual(atual)){
            this.data_inicio = data_inicio;
        }
        else{
            throw new IllegalArgumentException("Data início inválida!");
        }
    }


    public LocalDate getData_fim() {
        return data_fim;
    }


    public void setData_fim(LocalDate data_fim) {
        LocalDate atual = LocalDate.now();
        if (data_fim.isAfter(atual) || data_fim.isEqual(atual)){
            this.data_fim = data_fim;
        }
        else{
            throw new IllegalArgumentException("Data início inválida!");
        }
    }


    public double getObjetivo() {
        return objetivo;
    }


    public void setObjetivo(double objetivo) {
        if (objetivo > 0){
            this.objetivo = objetivo;
        }
        else{
            throw new IllegalArgumentException("Dado inválido (objetivo negativo)!");
        }
    }


    public String getStatus() {
        return status;
    }


    public void setStatus(String status) {
        this.status = status;
    }


    
    
    
}
