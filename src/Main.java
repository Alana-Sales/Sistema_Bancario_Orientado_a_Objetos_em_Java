import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("CPF: ");
        int cpf = Integer.parseInt(scanner.nextLine());
        System.out.print("Endereço: ");
        String endereco = scanner.nextLine();

        Cliente cliente = new Cliente(nome, cpf, endereco);

        for (int i = 0; i < 3; i++) {
            System.out.println("Nova conta:");
            System.out.print("Banco: ");
            String banco = scanner.nextLine();
            System.out.print("Data de criação: ");
            String data = scanner.nextLine();
            System.out.print("Número da conta: ");
            int numero = Integer.parseInt(scanner.nextLine());
            System.out.print("Agência: ");
            int agencia = Integer.parseInt(scanner.nextLine());
            System.out.print("Saldo: ");
            double saldo = Double.parseDouble(scanner.nextLine());
            System.out.print("Tipo (1 - Especial / 2 - Normal): ");
            int tipo = Integer.parseInt(scanner.nextLine());

            ContaBancaria conta = (tipo == 1)
                ? new ContaEspecial(banco, agencia, numero, saldo, data)
                : new ContaNormal(banco, agencia, numero, saldo, data);

            cliente.adicionarConta(conta);
        }

        System.out.print("Digite o número da conta para operação: ");
        int contaSelecionada = Integer.parseInt(scanner.nextLine());
        ContaBancaria conta = cliente.getContaPorNumero(contaSelecionada);

        if (conta != null) {
            System.out.print("Valor para crédito: ");
            double credito = Double.parseDouble(scanner.nextLine());
            conta.creditar(credito);

            System.out.print("Valor para débito: ");
            double debito = Double.parseDouble(scanner.nextLine());
            conta.debitar(debito);

            conta.mostrarSaldo();
        } else {
            System.out.println("Conta não encontrada.");
        }

        scanner.close();
    }
}
