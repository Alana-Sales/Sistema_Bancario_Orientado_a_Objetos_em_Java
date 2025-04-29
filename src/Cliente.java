import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private int cpf;
    private String endereco;
    private List<ContaBancaria> contas = new ArrayList<>();

    public Cliente(String nome, int cpf, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public void adicionarConta(ContaBancaria conta) {
        contas.add(conta);
    }

    public List<ContaBancaria> getContas() {
        return contas;
    }

    public ContaBancaria getContaPorNumero(int numeroConta) {
        for (ContaBancaria conta : contas) {
            if (conta.getNumeroConta() == numeroConta) return conta;
        }
        return null;
    }
}
