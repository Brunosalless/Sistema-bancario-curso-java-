public class ContaPoupanca extends ContaBancaria{

    public ContaPoupanca(Double saldo, TipoConta tipodaConta) {
        super(saldo, tipodaConta);
    }

    @Override
    public void depositar(double valor) {
        System.out.println("Valor depossitado na conta poupanca R$" + valor);
        System.out.println("AVISO: Depositos tem uma taxa de 10% ");
        double taxa = valor * 0.1;
        this.saldo = valor - taxa;

    }
}
