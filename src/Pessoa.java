public class Pessoa {
    protected String name;
    protected String email;
    protected String cpf;
    protected String idade;
    protected String numero;
    public Pessoa(String name, String email, String cpf, String idade, String numero) {
        this.name = name;
        this.email = email;
        this.cpf = cpf;
        this.idade = idade;
        this.numero = numero;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getCpf() {
        return cpf;
    }
    public String getIdade() {
        return idade;
    }
    public String getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return  "name='" + name +
                ", email='" + email +
                ", cpf='" + cpf +
                ", idade=" + idade +
                ", numero=" + numero
                ;
    }
}
