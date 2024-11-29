package ProjetoFinal.model;

public class Funcionario {
    private String nome;
    private String cargo;
    private int id;

    public Funcionario(String nome, String cargo, int id) {
        this.nome = nome;
        this.cargo = cargo;
        this.id = id;
    }

    public String getDetalhes() {
        return "Funcionário: " + nome + ", Cargo: " + cargo + ", ID: " + id;
    }

    public String getNome() {
        return nome;
    }

    public void realizarTarefa() {
    }
}
