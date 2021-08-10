package exercicio3;

import java.time.LocalDate;

public class SituacaoJogador {

    public static void main (String[] args){

        Jogador jogador1 = new Jogador("Marcel", "atacante", LocalDate.of(1982, 06, 21));

        System.out.println(jogador1.toString());

    }

}
