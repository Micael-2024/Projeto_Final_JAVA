package IdeiaProjetoFinal.model;

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

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public static Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        Item.categoria = categoria;
    }

    public String getDetalhes() {
        return "Item: " + nome + ", Código: " + codigo + " " + categoria.getDescricao();
    }
}
