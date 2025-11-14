package com.bancojava.app;
import com.bancojava.enumm.TipoConta;
import com.bancojava.banco.BancoKonoha;

public class Main {
    public static void main(String[] args) {
        BancoKonoha contaCorrente = new BancoKonoha(0.0, TipoConta.CORRENTE);

        contaCorrente.depositar(50000.0);
        contaCorrente.ConsultarSaldo();

        System.out.println("-------------------------------------------");

        BancoKonoha contaPoupanca = new BancoKonoha(0.0, TipoConta.POUPANCA);

        contaPoupanca.depositar(50000.0);
        contaPoupanca.ConsultarSaldo();

        System.out.println("-------------------------------------------");

        contaCorrente.tranferencia(contaPoupanca, 10000.0);

        contaPoupanca.tranferencia(contaCorrente, 5000.0);

        System.out.println("-------------------------------------------");

        contaPoupanca.ConsultarSaldo();
        contaCorrente.ConsultarSaldo();


    }
}
