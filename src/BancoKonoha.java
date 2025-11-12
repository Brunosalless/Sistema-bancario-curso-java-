public class BancoKonoha extends ContaBancaria{

    public BancoKonoha(Double saldo, TipoConta tipodaConta) {
        super(saldo, tipodaConta);
    }

    @Override
    public void depositar(double valor) {
        System.out.println("Valor depositado no Banco Konoha" + valor);
        double taxa = 0;

        if (TipodaConta == TipoConta.POUPANCA){
            System.out.println("Valor por deposito de 1%");
            taxa = valor * 0.01;
        }

        this.saldo += valor - taxa;
    }


    public void tranferencia(ContaBancaria destino, double valor){
        System.out.println("Valor da transferencia R$" + valor);
        double taxa = 0;

        if (TipodaConta == TipoConta.POUPANCA){
            System.out.println("Valor por transferencia");
        }

    }
}
