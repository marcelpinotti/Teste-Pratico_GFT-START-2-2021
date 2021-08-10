package exercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PapaiNoel {

    public static void main(String [] args){

        Scanner teclado = new Scanner(System.in);
        List<Crianca> criancas = new ArrayList<>();
        int boazinha = 0;
        int malvada = 0;

        System.out.print("Quantas crianças o papai noel vai presentear? ");

        int presentes[] = new int [teclado.nextInt()];

        for(int i = 0; i < presentes.length; i++){
            System.out.println("HO! HO! HO! Qual é o seu nome? Você foi uma criança boazinha ou uma criança malvada?");
            Crianca crianca = new Crianca(teclado.next(), teclado.next());
            criancas.add(crianca);
            String boa = "boazinha";
            String mal = "malvada";
            if (crianca.getPersonalidade().equals(boa)){
                boazinha+=1;
            } else if (crianca.getPersonalidade().equals(mal)) {
                malvada+=1;
            }
        }

        System.out.println("HO! HO! HO! Este ano eu vou presentear " + boazinha + " crianças, e não vou presentear " + malvada +
                " crianças de um total de " + presentes.length + " crianças.");











        teclado.close();
    }
}
