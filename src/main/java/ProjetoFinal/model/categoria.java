package IdeiaProjetoFinal.model;

public class Categoria {
    private String nome;
    private int id;

    public Categoria(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return "Categoria: " + nome + " (ID: " + id + ")";
    }
}
