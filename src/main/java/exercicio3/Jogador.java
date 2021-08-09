package exercicio3;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Jogador {

    private String nome;
    private String posicao;
    private LocalDate nascimento;

    public Jogador (String nome, String posicao, LocalDate nascimento){
        this.nome = nome;
        this.posicao = posicao;
        this.nascimento = nascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public long calcularIdade(){
        long anos = ChronoUnit.DAYS.between(LocalDate.now(), nascimento);
        return anos;
    }

    public String aposentar(String posicao) {
        long anos = ChronoUnit.DAYS.between(LocalDate.now(), nascimento);

        if (anos >= 40 && posicao == "defesa") {
            System.out.println("Jogar Aposentado.");
        } else {
            System.out.println(" Jogador na Ativa");
        }

        if (anos >= 38 && posicao == "meio-campo") {
            System.out.println("Jogar Aposentado.");
        } else {
            System.out.println(" Jogador na Ativa");
        }

        if (anos >= 35 && posicao == "atacante") {
            System.out.println("Jogar Aposentado.");
        } else {
            System.out.println(" Jogador na Ativa");
        }
    }

    @Override
    public String toString() {
        return "Jogador --> " +
                "nome = " + nome + '\'' +
                ", posicao = " + posicao + '\'' +
                ", nascimento = " + nascimento +
                '}';
    }
}
