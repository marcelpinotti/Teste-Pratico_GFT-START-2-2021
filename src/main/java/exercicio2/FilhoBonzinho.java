package exercicio2;

public class FilhoBonzinho extends FilhoLevado{

    public FilhoBonzinho(double saldo){
        super(saldo);
    }

    @Override
    public double sacar(double retirar) {
        final double comportamento = this.saldo * 0.01;
        final double devolvido = this.saldo - retirar;

        return this.saldo = devolvido - comportamento;
    }
}
