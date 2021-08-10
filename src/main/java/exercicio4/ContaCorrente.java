package exercicio4;

public class ContaCorrente extends Conta {

    @Override
    public double rendimentoMensal() {
        setSaldo(getSaldo() + getSaldo() *0.05);
        return getSaldo();
    }
}