package beans;

public class ParticipanteDesafio{
    private String id;
    private double progresso;
    private Pessoa pessoa;


    public ParticipanteDesafio(String id, double progresso, Pessoa pessoa) {
        this.id = id;
        this.setProgresso(progresso);
        this.pessoa = pessoa;
    }


    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
    }


    public double getProgresso() {
        return progresso;
    }


    public void setProgresso(double progresso) {
        if (progresso > 0){
            this.progresso = progresso;
        }
        else{
            throw new IllegalArgumentException("Dado inválido (progresso negativo)!");
        }
    }


    public Pessoa getPessoa() {
        return pessoa;
    }


    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }


    
}
