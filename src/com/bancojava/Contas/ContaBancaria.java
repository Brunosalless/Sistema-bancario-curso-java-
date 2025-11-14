package com.bancojava.Contas;
import com.bancojava.enumm.TipoConta;
import com.bancojava.interfaces.Conta;

public abstract class ContaBancaria implements Conta {

     protected Double saldo;
     protected TipoConta tipodaConta;

    public ContaBancaria(Double saldo, TipoConta tipodaConta) {
        this.saldo = saldo;
        this.tipodaConta = tipodaConta;
    }

    @Override
     public void ConsultarSaldo(){
         System.out.println("Saldo da Conta "+ tipodaConta + " R$ " + saldo);
     }

     @Override
     public abstract void depositar(double valor);

    public void adicionarSaldo(double valor){
        this.saldo += valor;
    }

    public void removerSaldo(double valor){
        this.saldo -= valor;
    }

}
