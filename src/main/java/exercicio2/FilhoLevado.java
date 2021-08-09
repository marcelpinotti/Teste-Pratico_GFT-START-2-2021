package exercicio2;

public class FilhoLevado implements Mesada {

    protected double saldo;

    public FilhoLevado(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public double saldo() {
        return this.saldo;
    }

    @Override
    public double pagar(double valor) {
        return this.saldo +=valor;
    }

    @Override
    public double sacar(double retirar) {
        final double comportamento = this.saldo * 0.05;
        final double devolvido = this.saldo - retirar;

        return this.saldo = devolvido - comportamento;
    }
}
