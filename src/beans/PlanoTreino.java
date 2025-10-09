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
        this.setDataInicio(dataInicio);
        this.setDataFim(dataFim);
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
        LocalDate dataAtual = LocalDate.now();
        if (dataInicio.isAfter(dataAtual) || dataInicio.isEqual(dataAtual)){
            this.dataInicio = dataInicio;
        }
        else{
            throw new IllegalArgumentException("Data de Início inválida!");
        }
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        LocalDate dataAtual = LocalDate.now();
        if (dataFim.isAfter(dataAtual) || dataFim.isEqual(dataAtual)){
            this.dataFim = dataFim;
        }
        else{
            throw new IllegalArgumentException("Data Fim inválida!");
        }
    }

    
    public void adicionarTreino(Treino treino){
        this.treinos.add(treino);
    }

    public void removerTreino(Treino treino){
        this.treinos.remove(treino);
    }
}
