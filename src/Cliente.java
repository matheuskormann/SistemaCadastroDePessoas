public class Cliente extends Pessoa {
private String endereco;

    public Cliente(String name, String email, String cpf, String idade, String numero, String endereco) {
        super(name, email, cpf, idade, numero);
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return " name='" + name +
                ", email='" + email +
                ", cpf='" + cpf +
                ", idade=" + idade +
                ", numero=" + numero +
                ", endereco='" + endereco ;

    }
}
