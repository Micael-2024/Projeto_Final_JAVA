package ProjetoFinal.model;

public class Estoquista extends Funcionario {
    public Estoquista(String nome, int id) {
        super(nome, "Estoquista", id);
    }

    @Override
    public void realizarTarefa() {
        System.out.println(getNome() + " está organizando itens no estoque.");
    }
}
