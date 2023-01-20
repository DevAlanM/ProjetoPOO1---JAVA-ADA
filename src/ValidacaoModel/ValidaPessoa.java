package ValidacaoModel;

import Model.PessoaCliente;
import Model.PessoaFuncionario;

public class ValidaPessoa {
    public static void validaCliente(String emailCliente) {

        PessoaCliente cliente = new PessoaCliente("111.111.111-11","AlanCliente","cliente@gmail.com");

        if (!emailCliente.equals(cliente.getEmail())) {
            System.out.println("Usuario não identificado ...");
            System.exit(0);
        }
    }

    public static void validaFuncionario(String emailFuncionario) {

        PessoaFuncionario funcionario = new PessoaFuncionario("222.222.222-22","AlanFuncionario","funcionario@gmail.com");

        if (!emailFuncionario.equals(funcionario.getEmail())){
            System.out.println("Usuario ainda não cadastrado...");
            System.exit(0);
        }
    }
}
