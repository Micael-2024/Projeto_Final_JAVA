import java.io.*;
import java.util.ArrayList;

public class BancoDeDados {
    private ArrayList<String> linhas;
    private ArrayList<Item> itens;

    public BancoDeDados(){
        linhas = new ArrayList<>();
        ler();
        itens = new ArrayList<>();
        transformarLinhasEmObjetos(linhas);

    }
    public void cadastrar(Item item) {
        String linha = "";
        try {
            OutputStream os = new FileOutputStream( "fardamento.txt", true); //false para apagar itens da lista
            OutputStreamWriter osw = new OutputStreamWriter(os);
            BufferedWriter br = new BufferedWriter(osw);

            linha = item.getNome()+","+item.getCodigo();
            br.write(linha);
            br.newLine();

            br.close();
            osw.close();
            os.close();
            System.out.println(linha+" foi cadastrado com sucesso !");
            System.out.println("O arquivo cadastro foi fechado !");
            atualizar();
        } catch (Exception e) {
            System.out.println("Não foi possivel escrever a informação no arquivo de texto !!");
            System.out.println(e);
        }
    }