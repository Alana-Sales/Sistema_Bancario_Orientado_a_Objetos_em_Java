public abstract class ContaBancaria {
    protected String banco;
    protected int agencia;
    protected int numeroConta;
    protected String dataCriacao;
    protected double saldo;

    public ContaBancaria(String banco, int agencia, int numeroConta, double saldo, String dataCriacao) {
        this.banco = banco;
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.dataCriacao = dataCriacao;
    }

    public abstract void creditar(double valor);
    public abstract void debitar(double valor);

    public void mostrarSaldo() {
        System.out.println("Saldo da conta " + numeroConta + ": R$ " + saldo);
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }
}
