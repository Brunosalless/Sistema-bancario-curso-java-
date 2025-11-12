public class Main {
    public static void main(String[] args) {
        ContaPoupanca Uchihas = new ContaPoupanca(0.0);
        Uchihas.depositar(50000.00);
        Uchihas.ConsultarSaldo();


        System.out.println("-------------------------------------------");

        ContaCorrente Uzumakis = new ContaCorrente(0.0);
        Uzumakis.depositar(10000.00);
        Uzumakis.ConsultarSaldo();
    }
}
