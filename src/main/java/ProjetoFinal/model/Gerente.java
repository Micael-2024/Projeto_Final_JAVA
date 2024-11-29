package ProjetoFinal.model;

public class Gerente extends Funcionario {
    public Gerente(String nome, int id) {
        super(nome, "Gerente", id);
    }

    @Override
    public void realizarTarefa() {
        System.out.println(getNome() + " está gerenciando o estoque.");
    }
}

public class Estoquista extends Funcionario {
    public Estoquista(String nome, int id) {
        super(nome, "Estoquista", id);
    }

    @Override
    public void realizarTarefa() {
        System.out.println(getNome() + " está organizando itens no estoque.");
    }
}
