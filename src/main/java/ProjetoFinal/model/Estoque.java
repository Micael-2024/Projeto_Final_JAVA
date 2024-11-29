package ProjetoFinal.model;

public class Estoque {
    private Item item;
    private int quantidade;

    public Estoque(Item item, int quantidade) {
        this.item = item;
        this.quantidade = quantidade;
    }

    public void atualizarQuantidade(int novaQuantidade) {
        this.quantidade = novaQuantidade;
    }

    public String getStatus() {
        return "Item: " + item.getNome() + ", Quantidade: " + quantidade;
    }
}