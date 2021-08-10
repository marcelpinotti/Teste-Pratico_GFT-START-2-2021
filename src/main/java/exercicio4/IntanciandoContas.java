package exercicio4;

public class IntanciandoContas {

    public static void main(String[] args){

        ContaCorrente cc = new ContaCorrente();
        cc.setNumero(1);
        cc.setTitular("Marcel");
        cc.setSaldo(1200.00);
        System.out.println("Conta Corrente nº: "+ cc.getNumero() + ", titular: " + cc.getTitular() + ", saldo: R$" + cc.getSaldo());
        cc.rendimentoMensal();
        System.out.println("Conta Corrente nº: "+ cc.getNumero() + ", titular: " + cc.getTitular() + ", saldo: R$" + cc.getSaldo());

        System.out.println("");

        ContaPoupanca cp = new ContaPoupanca();
        cp.setNumero(2);
        cp.setTitular("Viviane");
        cp.setSaldo(1200.00);
        System.out.println("Conta Corrente nº: "+ cp.getNumero() + ", titular: " + cp.getTitular() + ", saldo: R$" + cp.getSaldo());
        cp.rendimentoMensal();
        System.out.println("Conta Poupança nº: "+ cp.getNumero() + ", titular: " + cp.getTitular() + ", saldo: R$" + cp.getSaldo());



    }
}
