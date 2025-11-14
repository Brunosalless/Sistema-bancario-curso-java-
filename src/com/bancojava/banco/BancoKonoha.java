package com.bancojava.banco;
import com.bancojava.Contas.ContaBancaria;
import com.bancojava.enumm.*;



public class BancoKonoha extends ContaBancaria {

    public BancoKonoha(Double saldo, TipoConta tipodaConta) {
        super(saldo, tipodaConta);
    }

    @Override
    public void depositar(double valor) {
        System.out.println("Valor depositado na conta " + tipodaConta + " no valor de R$ " + valor);
        double taxa = 0;

        if (tipodaConta == TipoConta.POUPANCA){
            System.out.println("Taxa por deposito de 1%");
            taxa = valor * 0.01;
        }

        this.saldo += valor - taxa;
    }


    public void tranferencia(ContaBancaria destino, double valor){
        System.out.println("Transferencia da conta " + tipodaConta + " no Valor de R$ " + valor + " Foi realizado com sucesso");


        if (this.saldo < valor) {
            System.out.println("ERRO: Saldo insuficiente.");
            return;
        }

        double taxa = 0;

        if (tipodaConta == TipoConta.POUPANCA){
            System.out.println("Taxa de tranferencia de: 1%");
            taxa = valor * 0.01;
        }

        this.removerSaldo(valor + taxa);
        destino.adicionarSaldo(valor);


    }
}
