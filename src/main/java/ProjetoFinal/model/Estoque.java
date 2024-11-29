package ProjetoFinal.model;

import Interfaces.IRelatorio;

public class Estoque implements IRelatorio {
    private Item item;
    private int quantidade;

    public Estoque(Item item, int quantidade) {
        this.item = item;
        this.quantidade = quantidade;
    }

    @Override
    public void gerarRelatorio() {
        System.out.println("Relatório de Estoque: Item: " + item.getNome() + ", Quantidade: " + quantidade);
    }

    public void adicionarItem(int geral) {
    }
}

