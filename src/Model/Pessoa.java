package Model;

public class Pessoa {

    protected String nome;
    public String email;

    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail(){
        return email;
    }

    protected void setEmail(String email) {
        this.email = email;
    }
}
