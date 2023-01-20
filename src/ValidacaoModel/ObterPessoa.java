package ValidacaoModel;

import java.util.Scanner;
import static ValidacaoModel.ValidaPessoa.validaCliente;
import static ValidacaoModel.ValidaPessoa.validaFuncionario;

public class ObterPessoa {
    public static void obterUsuario() {
        Scanner login = new Scanner(System.in);

        System.out.println("Deseja entrar como Cliente ou Funcionario");
        System.out.println("Digite uma das opções abaixo: \n 1. Cliente \n 2. Funcionario");
        int escolhaUsuario = login.nextInt();

        if (escolhaUsuario == 1) {
            System.out.println("Olá Cliente, digite seu email");
            String emailCliente = login.next();
            validaCliente(emailCliente);
            System.out.println();

        } else if (escolhaUsuario == 2) {
            System.out.println("Olá Funcionario, digite seu email");
            String emailFuncionario = login.next();
            validaFuncionario(emailFuncionario);
            System.out.println();
        } else {
            System.out.println("Opção inválida");
        }

    }
}
