public class Funcionario extends Pessoa {
 protected String salario;

    public Funcionario(String name, String email, String cpf, String idade, String numero, String salario) {
        super(name, email, cpf, idade, numero);
        this.salario = salario;
    }

    public String getSalario() {
        return salario;
    }


    @Override
    public String toString() {
        return " name='" + name +
                ", email='" + email +
                ", cpf='" + cpf +
                ", idade=" + idade +
                ", numero=" + numero +
                ", salario=" + salario ;
    }
}
