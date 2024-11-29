package ProjetoFinal.model;

public class Gerente extends Funcionario {
    public Gerente(String nome, int id) {
        super(nome, "Gerente", id);
    }

    @Override
    public void realizarTarefa() {
        System.out.println(getNome() + " está gerenciando a loja.");
    }
}
