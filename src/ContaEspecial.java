public class ContaEspecial extends ContaBancaria {
    private double limite = 1000.0;

    public ContaEspecial(String banco, int agencia, int numeroConta, double saldo, String dataCriacao) {
        super(banco, agencia, numeroConta, saldo, dataCriacao);
    }

    @Override
    public void creditar(double valor) {
        saldo += valor;
    }

    @Override
    public void debitar(double valor) {
        if (saldo + limite >= valor) saldo -= valor;
        else System.out.println("Limite insuficiente.");
    }
}
