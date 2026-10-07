package flamingo.aprendendo.intermediario.dominio;

public class ContaBancaria {
    public String titular;
    public int numeroConta;
    public double saldo;

    public boolean temSaldo() {
        return saldo > 0;
    }

    public boolean podeSacar(double valorSaque) {
        return valorSaque <= saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
}