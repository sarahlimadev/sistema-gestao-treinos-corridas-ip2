package beans;

public class Relatorio {
    private Pessoa pessoa;

    
    public Relatorio(Pessoa pessoa) {
        this.pessoa = pessoa;
    }


    @Override
    public String toString() {
        return String.format("ID: %s | Pessoa: %s | Idade: %d | Peso: %.2f | Altura: %.2f | e-mail: %s", 
        pessoa.getId(), pessoa.getNome(), pessoa.getIdade(), pessoa.getPeso(), pessoa.getAltura(), 
        pessoa.getEmail());
    }

    
}
