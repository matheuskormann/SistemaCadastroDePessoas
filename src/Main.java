import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Cadastrar Cliente");
            System.out.println("2. Cadastrar Funcionário");
            System.out.println("3. Cadastrar Gerente");
            System.out.println("4. Listar todas as pessoas");
            System.out.println("5. Buscar pessoas por tipo");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do cliente: ");
                    String nomeCliente = scanner.nextLine();
                    System.out.print("Email do cliente: ");
                    String emailCliente = scanner.nextLine();
                    System.out.print("CPF do cliente: ");
                    String cpfCliente = scanner.nextLine();
                    System.out.print("Idade do cliente: ");
                    String idadeCliente = scanner.nextLine();
                    System.out.print("Numero do cliente: ");
                    String numeroCliente = scanner.nextLine();
                    System.out.print("Endereco do cliente: ");
                    String enderecoCliente = scanner.nextLine();
                    Cliente cliente = new Cliente(nomeCliente, emailCliente, cpfCliente, idadeCliente, numeroCliente, enderecoCliente);
                    pessoas.add(cliente);
                    break;
                case 2:
                    System.out.print("Nome do funcionário: ");
                    String nomeFuncionario = scanner.nextLine();
                    System.out.print("Email do funcionário: ");
                    String emailFuncionario = scanner.nextLine();
                    System.out.print("CPF do funcionário: ");
                    String cpfFuncionario = scanner.nextLine();
                    System.out.print("Idade do funcionário: ");
                    String idadeFuncionario = scanner.nextLine();
                    System.out.print("Numero do funcionário: ");
                    String numeroFuncionario = scanner.nextLine();
                    System.out.print("Salario do funcionário: ");
                    String salarioFuncionario = scanner.nextLine();
                    Funcionario funcionario = new Funcionario(nomeFuncionario, emailFuncionario, cpfFuncionario, idadeFuncionario, numeroFuncionario, salarioFuncionario);
                    pessoas.add(funcionario);
                    break;
                case 3:
                    System.out.print("Nome do gerente: ");
                    String nomeGerente = scanner.nextLine();
                    System.out.print("Email do gerente: ");
                    String emailGerente = scanner.nextLine();
                    System.out.print("CPF do gerente: ");
                    String cpfGerente = scanner.nextLine();
                    System.out.print("Idade do gerente: ");
                    String idadeGerente = scanner.nextLine();
                    System.out.print("Numero do gerente: ");
                    String numeroGerente = scanner.nextLine();
                    System.out.print("salario do gerente: ");
                    String salarioGerente = scanner.nextLine();
                    System.out.print("codigo do gerente: ");
                    String codigoGerenteGerente = scanner.nextLine();
                    Gerente gerente = new Gerente(nomeGerente, emailGerente, cpfGerente, idadeGerente, nomeGerente, salarioGerente, codigoGerenteGerente);
                    pessoas.add(gerente);
                    break;
                case 4:
                    System.out.println("Lista de todas as pessoas cadastradas:");
                    for (Pessoa pessoa : pessoas) {
                        System.out.println(pessoa);
                    }
                    break;
                case 5:
                    System.out.print("Digite o tipo de pessoa (Cliente, Funcionario, Gerente): ");
                    String tipoPessoa = scanner.nextLine();
                    System.out.println("Pessoas do tipo " + tipoPessoa + ":");
                    for (Pessoa pessoa : pessoas) {
                        if (pessoa.getClass().getSimpleName().equals(tipoPessoa)) {
                            System.out.println(pessoa);
                        }
                    }
                    break;
                case 6:
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}