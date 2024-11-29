package ProjetoFinal.model;

public class Relatorio {

    public void gerarRelatorioEstoque(ArrayList<Estoque> estoques) {
        System.out.println("Relatório de Estoque:");
        for (Estoque estoque : estoques) {
            System.out.println(estoque.getStatus());
        }
    }

    public void gerarRelatorioPedidos(ArrayList<Pedido> pedidos) {
        System.out.println("Relatório de Pedidos:");
        for (Pedido pedido : pedidos) {
            System.out.println(pedido.getDetalhesPedido());
        }
    }
}
