package ProjetoFinal.model;

public class Item {
    private String nome;
    private int codigo;
    private static Categoria categoria;

    public Item(String nome, int codigo, Categoria categoria) {
        this.nome = nome;
        this.codigo = codigo;
        Item.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public String getDetalhes() {
        return "Item: " + nome + ", Código: " + codigo;
    }
}
