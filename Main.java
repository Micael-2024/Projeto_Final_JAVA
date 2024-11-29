public class Main {
    public static void main(String[] args) {

        System.out.println("=== Sistema de Almoxarifado ===");

        // Criar instâncias de Categoria
        Categoria papelaria = new Categoria("Papelaria", 1);
        Categoria limpeza = new Categoria("Limpeza", 2);

        // Criar instâncias de Item associando uma Categoria
        Item caneta = new Item("Caneta", 101, papelaria);
        Item detergente = new Item("Detergente", 201, limpeza);

        // Exibir características das categorias
        System.out.println("\n--- Categorias Cadastradas ---");
        System.out.println(papelaria.getDescricao());
        System.out.println(limpeza.getDescricao());

        // Exibir detalhes dos itens
        System.out.println("\n--- Itens Cadastrados ---");
        System.out.println(caneta.getDetalhes());
        System.out.println(detergente.getDetalhes());


        // Criar instâncias de Funcionario
        Funcionario funcionario1 = new Funcionario("João Pedro", "Estoquista", 101);
        Funcionario funcionario2 = new Estoquista("João",  101);
        Funcionario funcionario3 = new Funcionario("Jorge Cordeiro", "Gerente", 102);
        Funcionario funcionario4 = new Gerente("Jorge",  102);


        // Exibir detalhes dos funcionários
        System.out.println("\n--- Funcionários Cadastrados ---");
        System.out.println(funcionario2.getDetalhes());
        System.out.println(funcionario4.getDetalhes());

        // Simular realização de tarefas
        System.out.println("\n--- Função desempenhada ---");
        funcionario2.realizarTarefa();
        funcionario4.realizarTarefa();


        // Criar um estoque para o item com uma quantidade inicial
        Estoque estoqueCaneta = new Estoque(caneta, 50);

        // Exibir relatório de estoque
        System.out.println("\n--- Relatório Inicial ---");
        estoqueCaneta.gerarRelatorio();

        // Adicionar mais itens ao estoque
        estoqueCaneta.adicionarItem(30);


        System.out.println("\nSistema Finalizado!");
    }
}