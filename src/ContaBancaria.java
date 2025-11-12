public abstract class ContaBancaria implements Conta{

    Double saldo;
    TipoConta TipodaConta;

    public ContaBancaria(Double saldo, TipoConta tipodaConta) {
        this.saldo = saldo;
        TipodaConta = tipodaConta;
    }

    @Override
     public void ConsultarSaldo(){
         System.out.println("Saldo da Conta R$" + saldo);
     }

     @Override
     public abstract void depositar(double valor);
}
