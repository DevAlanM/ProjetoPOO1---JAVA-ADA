package Model;

public class PessoaFuncionario extends Pessoa{

    protected String cnpj;

    public PessoaFuncionario(String cnpj, String nome, String email){
        this.cnpj = cnpj;
        this.nome = nome;
        this.email = email;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

}
