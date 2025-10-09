package beans;

import java.time.LocalDate;
import java.util.ArrayList;

public class Desafio {
    private String id;
    private String tipo;
    private String descricao;
    private double objetivo;
    private LocalDate dataInicio;
    private LocalDate dataFim; 
    private ArrayList<ParticipanteDesafio> parts;


    public Desafio(String id, String tipo, String descricao, double objetivo, LocalDate dataInicio, LocalDate dataFim) {
        this.id = id;
        this.tipo = tipo;
        this.descricao = descricao;
        this.setObjetivo(objetivo);
        this.setDataInicio(dataInicio);
        this.setDataFim(dataFim);
        this.parts = new ArrayList<>();
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


    public String getDescricao() {
        return descricao;
    }


    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    public double getObjetivo() {
        return objetivo;
    }


    public void setObjetivo(double objetivo) {
        if (objetivo > 0)
        {
            this.objetivo = objetivo;
        }
        else{
            throw new IllegalArgumentException("Dado inválido (objetivo negativo)!");
        }
    }


    public LocalDate getDataInicio() {
        return dataInicio;
    }


    public void setDataInicio(LocalDate dataInicio) {
        LocalDate atual = LocalDate.now();
        if (dataInicio.isAfter(atual) || dataInicio.isEqual(atual)){
            this.dataInicio = dataInicio;
        }
        else{
            throw new IllegalArgumentException("Data início inválida!");
        }
    }


    public LocalDate getDataFim() {
        return dataFim;
    }


    public void setDataFim(LocalDate dataFim) {
        LocalDate atual = LocalDate.now();
        if (dataFim.isAfter(atual) || dataFim.isEqual(atual)){
            this.dataFim = dataFim;
        }
        else{
            throw new IllegalArgumentException("Data fim inválida!");
        }
    }


    public void adicionarParticipante(ParticipanteDesafio p){
        this.parts.add(p);
    }
    
    public void removerParticipante(ParticipanteDesafio p){
        this.parts.remove(p);
    }

    public String mostrarProgresso(String id_p){
        String progresso = "Progresso não encontrado!"; 
        for (ParticipanteDesafio p: parts){
            if (id_p.equals(p.getId())){
                progresso = String.format("Participante: %s | Progresso: %s", p.getPessoa().getNome(), p.getProgresso());
                break;
            }
        }

        return progresso;
    }
}
