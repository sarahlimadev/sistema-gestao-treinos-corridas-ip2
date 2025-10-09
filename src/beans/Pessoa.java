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
        this.setIdade(idade);
        this.setPeso(peso);
        this.setAltura(altura);
        this.email = email;
        this.planos = new ArrayList<>();
        this.desafios = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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
        if (idade > 0){
            this.idade = idade;
        }
        else{
            throw new IllegalArgumentException("Dado inválido (idade negativa)!");
        }
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso > 0){
            this.peso = peso;
        }
        else{
            throw new IllegalArgumentException("Dado inválido (peso negativa)!");
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura > 0){
            this.altura = altura;
        }
        else{
            throw new IllegalArgumentException("Dado inválido (altura negativa)!");
        }
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

    public void removerPlano(PlanoTreino plano){
        this.planos.remove(plano);
    }

    public void adicionarDesafio(Desafio desafio){
        this.desafios.add(desafio);
    }

    public void removerDesafio(Desafio desafio){
        this.desafios.remove(desafio);
    }
}
