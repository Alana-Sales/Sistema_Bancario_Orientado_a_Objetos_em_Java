public class ContaNormal extends ContaBancaria {
    public ContaNormal(String banco, int agencia, int numeroConta, double saldo, String dataCriacao) {
        super(banco, agencia, numeroConta, saldo, dataCriacao);
    }

    @Override
    public void creditar(double valor) {
        saldo += valor;
    }

    @Override
    public void debitar(double valor) {
        if (saldo >= valor) saldo -= valor;
        else System.out.println("Saldo insuficiente.");
    }
}
