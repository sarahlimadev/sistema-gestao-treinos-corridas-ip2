package beans;

import java.time.LocalDate;
import java.util.ArrayList;

public class PlanoTreino {
    private String id;
    private ArrayList<Treino> treinos;
    private LocalDate dataInicio;
    private LocalDate dataFim;

    public PlanoTreino(String id, LocalDate dataInicio, LocalDate dataFim) {
        this.id = id;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.treinos = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    
    public void adicionarTreino(Treino treino){
        this.treinos.add(treino);
    }

    public void removerTreino(Treino treino){
        this.treinos.remove(treino);
    }
}
