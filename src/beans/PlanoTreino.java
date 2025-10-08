package beans;

import java.time.LocalDate;
import java.util.ArrayList;

public class PlanoTreino {
    private String id;
    private ArrayList<Treino> treinos;
    private LocalDate data_inicio;
    private LocalDate data_fim;

    public PlanoTreino(String id, LocalDate data_inicio, LocalDate data_fim) {
        this.id = id;
        this.treinos = new ArrayList<>();
        this.data_inicio = data_inicio;
        this.data_fim = data_fim;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getData_inicio() {
        return data_inicio;
    }

    public void setData_inicio(LocalDate data_inicio) {
        this.data_inicio = data_inicio;
    }

    public LocalDate getData_fim() {
        return data_fim;
    }

    public void setData_fim(LocalDate data_fim) {
        this.data_fim = data_fim;
    }

    
    public void adicionarTreino(Treino treino){
        treinos.add(treino);
    }

    public String removerTreino(String id_treino){
        String resultado = "Treino não encontrado"; 
        for (Treino treino : treinos){
            if (id_treino.equals(treino.getId())){
                treinos.remove(treino);
                resultado = String.format("Treino %s removido com sucesso!", id_treino);
                break;
            }
        }

        return resultado;
    }

    public void atualizarDatas(LocalDate d_i, LocalDate d_f){
        this.setData_inicio(d_i);
        this.setData_fim(d_f);
    }

}
