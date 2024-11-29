package IdeiaProjetoFinal.controller;

import IdeiaProjetoFinal.model.*;
import java.io.*;
import java.util.ArrayList;


public class BancoDeDados {
    private ArrayList<String> linhas;
    private ArrayList<Item> itens;
    private ArrayList<Funcionario> funcionarios; // Lista de funcionários
    private ArrayList<Estoque> estoques; // Lista de estoques


    public BancoDeDados() {
        linhas = new ArrayList<>();
        ler();
        itens = new ArrayList<>();
        funcionarios = new ArrayList<>();
        transformarLinhasEmObjetos(linhas);
    }

    public void ler() {
        String linha = "";
        try {
            InputStream is = new FileInputStream("Infos.txt");
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);

            linha = br.readLine();

            while (linha != null) {
                System.out.println(linha);
                linhas.add(linha);
                linha = br.readLine();
            }

        } catch (Exception e) {
            System.out.println("Não foi possivel ler o arquivo de texto !!");
            System.out.println(e);
        }
    }

    public void transformarLinhasEmObjetos(ArrayList<String> linhas) {
        itens.clear(); // Limpa os itens existentes para evitar duplicação
        for (String linha : linhas) {
            try {
                String[] partes = linha.split(",");
                String nome = partes[0];
                int codigo = Integer.parseInt(partes[1]);
                String descricaoCategoria = partes[2];
                int codigoCategoria = Integer.parseInt(partes[3]);

                Categoria categoria = new Categoria(descricaoCategoria, codigoCategoria);
                Item item = new Item(nome, codigo, categoria);
                itens.add(item);
            } catch (Exception e) {
                System.out.println("Erro ao transformar linha em objeto: " + linha);
                System.out.println("Detalhes do erro: " + e.getMessage());
            }
        }
    }

    public ArrayList<Item> getItens() {
        return itens;
    }

    public void atualizar() {
        ler();
        transformarLinhasEmObjetos(linhas);

        System.out.println("Os dados dos itens foram atualizados com as novas informações cadastradas !!");
    }

    public void cadastrarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
        System.out.println("Funcionário " + funcionario.getNome() + " cadastrado com sucesso!");
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios; // Retorne a lista corretamente inicializada
    }

    public void adicionarAoEstoque(Item item1, int i) {
    }

    public Iterable<? extends Estoque> getEstoques() {
        return estoques;
    }

    public void atualizarPedido(int i, String concluído) {

    }
}
