package beans;

import java.util.ArrayList;

public class Pessoa {
    private String id;
    private String nome;
    private int idade;
    private double peso;
    private double altura;
    private String email;
    private ArrayList<PlanoTreino> planos;
    private ArrayList<Desafio> desafios;
    
    
    public Pessoa(String id, String nome, int idade, double peso, double altura, String email) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
        this.email = email;
        this.planos = new ArrayList<>();
        this.desafios = new ArrayList<>();
    }

    
    public String getId(){
        return this.id;
    }


    public void setId(String id){
        this.id = id;
    }

    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public int getIdade() {
        return idade;
    }


    public void setIdade(int idade) {
        this.idade = idade;
    }


    public double getPeso() {
        return peso;
    }


    public void setPeso(double peso) {
        this.peso = peso;
    }


    public double getAltura() {
        return altura;
    }


    public void setAltura(double altura) {
        this.altura = altura;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public void adicionarPlano(PlanoTreino plano){
        this.planos.add(plano);
    }

    public String removerPlano(String id_plano){
        String resultado = "Plano não encontrado";
        for (PlanoTreino plano : planos){
            if (id_plano.equals(plano.getId())){
                planos.remove(plano);
                resultado = String.format("Plano %s foi removido com sucesso!", id_plano);
                break;
            }
        }

        return resultado;
    }

    public void adicionarDesafio(Desafio desafio){
        this.desafios.add(desafio);
    }
}
