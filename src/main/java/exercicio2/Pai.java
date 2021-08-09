package exercicio2;

public class Pai {

    public static void main (String[] args){

        FilhoLevado filhoLevado = new FilhoLevado(150.0);
        FilhoBonzinho filhoBonzinho= new FilhoBonzinho(150.00);

        System.out.println("Saldo filho levado: R$ " + filhoLevado.saldo());
        System.out.println("Saldo filho bonzinho: R$ "+ filhoBonzinho.saldo());

        filhoLevado.pagar(120.00);
        filhoBonzinho.pagar(120.00);

        System.out.println("Saldo filho levado: R$ " + filhoLevado.saldo());
        System.out.println("Saldo filho bonzinho: R$ "+ filhoBonzinho.saldo());


        filhoLevado.sacar(120.00);
        filhoBonzinho.sacar(120.00);

        System.out.println("Saldo filho levado: R$ " + filhoLevado.saldo());
        System.out.println("Saldo filho bonzinho: R$ "+ filhoBonzinho.saldo());

    }
}
