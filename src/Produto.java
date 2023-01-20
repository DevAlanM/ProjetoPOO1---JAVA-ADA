import java.util.Scanner;
public class Produto {
    private int idProduto;
    private String nomeProduto;
    private String descricaoProduto;
    private int quantidade = 0;
    private double valor = 0;
    private TipoProduto tipoProduto;
    private double valorTotal;
    private double valorDesconto;

    public Produto() {
    }
    public Produto(int idTipoProduto) {
        this.tipoProduto = TipoProduto.getById(idTipoProduto);
    }
    public Produto(int idProduto, String nomeProduto, String descricaoProduto, int quantidade, double valor, TipoProduto tipoProduto) {
        this.idProduto = idProduto;
        this.nomeProduto = nomeProduto;
        this.descricaoProduto = descricaoProduto;
        this.quantidade = quantidade;
        this.valor = valor;
        this.tipoProduto = tipoProduto;
    }




    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    public TipoProduto getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(TipoProduto tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public void getValorTotal(double valor, int quantidade) {
        valorTotal = valor * quantidade;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public static double getValorDesconto(double valorDesconto) {
        return valorDesconto;
    }

    public void setValorDesconto(double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    void adicionarProduto() {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o Código do Produto: ");
        idProduto = input.nextInt();
        System.out.println("Digite o Nome do Produto: ");
        nomeProduto = input.next();
        System.out.println("Digite o Tipo do Produto: ");
        int idTipoProduto = input.nextInt();
        TipoProduto tipoProduto = TipoProduto.getById(idTipoProduto);
        System.out.println("Digite a Descricao do Produto: ");
        descricaoProduto = input.next();
        System.out.println("Digite a quantidade: ");
        int quantidade = input.nextInt();
        System.out.println("Digite o valor de cada produto: ");
        valor = input.nextDouble();
        System.out.println();

        Estoque.cadastrarProduto(idProduto, nomeProduto, descricaoProduto, quantidade, valor, tipoProduto);

        getValorTotal(valor, quantidade);
        descontoPorTipoProduto(idTipoProduto, valorTotal); // desconto na venda

        System.out.println("Seu novo produto cadastrado é um(a) " + nomeProduto + " do Tipo: " + tipoProduto.getDescricao() + ", quantidade: " + quantidade + " un, valor: R$ " + valorDesconto);

    }

    public  void descontoPorTipoProduto(int idTipoProduto, double valorTotal) {
        switch (idTipoProduto) {
            case 0 -> {
                setValorDesconto(valorTotal * 0.95);
                System.out.println("Voce obteve 5% de desconto, o valor com o desconto aplicado é de R$ " + getValorDesconto(valorDesconto) + ".");
            }
            case 1 -> {
                setValorDesconto(valorTotal * 0.90);
                System.out.println("Voce obteve 10% de desconto, o valor com o desconto aplicado é de R$ " + getValorDesconto(valorDesconto) + ".");
            }
            case 2 -> {
                setValorDesconto(valorTotal * 0.85);
                System.out.println("Voce obteve 15% de desconto, o valor com o desconto aplicado é de R$ " + getValorDesconto(valorDesconto) + ".");
            }
            case 3 -> {
                setValorDesconto(valorTotal * 0.80);
                System.out.println("Voce obteve 20% de desconto, o valor com o desconto aplicado é de R$ " + getValorDesconto(valorDesconto) + ".");
            }
            default -> System.out.println("O produto não possui cupom de desconto");
        }
    }


    @Override
    public String toString() {
        return "Produto{" +
                "idProduto=" + idProduto +
                ", nomeProduto='" + nomeProduto + '\'' +
                ", descricaoProduto='" + descricaoProduto + '\'' +
                ", quantidade=" + quantidade +
                ", valor=" + valor +
                ", tipoProduto=" + tipoProduto +
                ", valorTotal=" + valorTotal +
                ", valorDesconto=" + valorDesconto +
                '}';
    }
}
