package ProjetoFinal.model;

public class Categoria {
    private String nome;
    private int id;

    public Categoria(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    public String getDescricao() {
        return "Categoria: " + nome + " (ID: " + id + ")";
    }
}
