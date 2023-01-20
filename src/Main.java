import Model.PessoaCliente;
import Model.PessoaFuncionario;

import java.util.Scanner;

import static ValidacaoModel.ObterPessoa.obterUsuario;

public class Main {
    public static void main(String[] args) {
        obterUsuario();
        escolhaMenu();
    }

    public static void escolhaMenu() {
        Scanner input = new Scanner(System.in);

        System.out.println("Olá seja bem vindo a Americanas, o que deseja fazer? ");
        System.out.println("Digite uma das opções abaixo: \n 1. Adicionar Produto \n 2. Comprar \n 3. Verificar Estoque \n 4. Sair");
        int escolhaUsuario = input.nextInt();

        switch (escolhaUsuario) {
            case 1 -> {
                Produto produto = new Produto();
                produto.adicionarProduto();
                System.out.println();
                acaoRetornarMenu();
            }
            case 2 -> {
                System.out.println("OPÇÃO EM MANUTENÇÃO");
                //Produto.descontoPorTipoProduto();

                acaoRetornarMenu();
            }
            case 3 -> {
                Estoque.listarProduto();
                acaoRetornarMenu();
            }
            case 4 -> {
                System.out.println("Obrigado pela preferencia.");
                System.exit(0);
            }
            default -> {
                throw new IllegalArgumentException("Valor inválido, tente novamente");

            }
        }
    }

    public static void acaoRetornarMenu() {
        Scanner input = new Scanner(System.in);
        System.out.println("Deseja voltar para o menu ? S/N");
        String acaoMenu = input.next();

        if (acaoMenu.equalsIgnoreCase("S")) {
            escolhaMenu();
        } else if (acaoMenu.equalsIgnoreCase("N")) {
            System.exit(0);
        } else {
            throw new IllegalArgumentException();
        }
    }
}

