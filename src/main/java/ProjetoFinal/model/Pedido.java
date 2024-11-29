package ProjetoFinal.model;

public class Pedido {
    private int id;
    private Funcionario solicitante;
    private Item item;
    private int quantidade;
    private String status;

    public Pedido(int id, Funcionario solicitante, Item item, int quantidade, String status) {
        this.id = id;
        this.solicitante = solicitante;
        this.item = item;
        this.quantidade = quantidade;
        this.status = status;
    }

    public void atualizarStatus(String novoStatus) {
        this.status = novoStatus;
    }

    public String getDetalhesPedido() {
        return "Pedido ID: " + id + ", Solicitante: " + solicitante.getDetalhes() +
                ", Item: " + item.getNome() + ", Quantidade: " + quantidade + ", Status: " + status;
    }
}
