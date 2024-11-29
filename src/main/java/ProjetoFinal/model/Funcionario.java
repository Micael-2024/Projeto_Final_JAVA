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

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public int getId() {
        return id;
    }

    public void realizarTarefa() {
        System.out.println(nome + " está realizando uma tarefa genérica.");
    }
}
