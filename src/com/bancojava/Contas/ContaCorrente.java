package com.bancojava.Contas;
import com.bancojava.enumm.TipoConta;

public class ContaCorrente extends ContaBancaria {

    public ContaCorrente(Double saldo, TipoConta tipodaConta) {
        super(saldo, tipodaConta);
    }

    @Override
    public void depositar(double valor) {
        System.out.println("Valor depositado na conta corrente R$" + valor);
        this.saldo += valor;
    }


}
