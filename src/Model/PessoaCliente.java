package Model;

public class PessoaCliente extends Pessoa{
    protected String cpf;

    PessoaCliente(){

    }

    public PessoaCliente(String cpf, String nome, String email){
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


}
