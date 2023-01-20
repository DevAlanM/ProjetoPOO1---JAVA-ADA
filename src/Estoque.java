import java.util.ArrayList;
import java.util.List;

public class Estoque {

    private static final List<Produto> listaDeProdutos = new ArrayList<>();

    public static void cadastrarProduto(int idProduto, String nomeProduto, String descricaoProduto, int quantidade, double valor, TipoProduto tipoProduto) {
        listaDeProdutos.add(new Produto(idProduto, nomeProduto, descricaoProduto, quantidade, valor, tipoProduto));
    }

    public static void listarProduto() {
        listaDeProdutos.forEach(System.out::println);

    }

}



