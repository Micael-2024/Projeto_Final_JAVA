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

    public void ler() {
        String linha = "";
        try {
            InputStream is = new FileInputStream("fardamento.txt");
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);

            linha = br.readLine();

            while(linha != null) {
                System.out.println(linha);
                linhas.add(linha);
                linha = br.readLine();
            }

            br.close();
            isr.close();
            is.close();
            System.out.println("O arquivo texto foi lido com sucesso !");

        } catch (Exception e) {
            System.out.println("Não foi possivel ler o arquivo de texto !!");
            System.out.println(e);
        }
    }

    public void transformarLinhasEmObjetos(ArrayList<String> linhas) {
        String[] aux = new String[2];
        Item item;

        for (int i = 0; i < linhas.size(); i++) {
            aux = linhas.get(i).split(","); // calça, 1201
            item = new Item(aux[0], Integer.parseInt(aux[1]));
            itens.add(item);
        }

        System.out.println("Os dados do Arquivo ja são objetos Java !");
    }

    public ArrayList<Item> getItens() {
        return itens;
    }

    public void atualizar() {
        ler();
        transformarLinhasEmObjetos(linhas);

        System.out.println("Os dados dos itens foram atualizados com as novas informações cadastradas !!");
    }
}