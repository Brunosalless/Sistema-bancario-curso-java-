public class ContaCorrente extends ContaBancaria {

    public ContaCorrente(Double saldo) {
        super(saldo);
    }


    @Override
    public void depositar(double valor) {
        System.out.println("Valor depositado na conta corrente R$" + valor);
        this.saldo += valor;
    }


}
