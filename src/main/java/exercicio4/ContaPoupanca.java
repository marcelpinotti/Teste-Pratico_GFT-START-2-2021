package exercicio4;

public class ContaPoupanca extends Conta{


    @Override
    public double rendimentoMensal() {
        setSaldo(getSaldo() + getSaldo()*0.07);
        return getSaldo();
    }
}
