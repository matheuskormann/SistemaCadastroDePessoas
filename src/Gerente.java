import java.security.SecureRandom;

public class Gerente extends Funcionario {
    private String codigoGerente;

    public Gerente(String name, String email, String cpf, String idade, String numero, String salario, String codigoGerente) {
        super(name, email, cpf, idade, numero, salario);
        this.codigoGerente = codigoGerente;
    }

    public String getCodigoGerente() {
        return codigoGerente;
    }

    @Override
    public String toString() {
        return "name='" + name +
                ", email='" + email +
                ", cpf='" + cpf +
                ", idade=" + idade +
                ", numero=" + numero +
                ", codigoGerente='" + codigoGerente +
                ", salario=" + salario ;
    }
}

