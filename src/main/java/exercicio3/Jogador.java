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
        long anos = ChronoUnit.YEARS.between(nascimento, LocalDate.now());
        return anos;
    }

    public String aposentar() {
        long anos = ChronoUnit.YEARS.between(nascimento, LocalDate.now());

        final String aposentado;

        if (anos >= 40 && getPosicao() == "defesa") {
            aposentado = "Jogador aposentado";
        }else if (anos >= 38 && getPosicao() == "meio-campo") {
            aposentado = "Jogador aposentado";
        }else if (anos >= 35 && getPosicao() == "atacante") {
            aposentado = "Jogador aposentado";
        } else {
            aposentado = " Jogador na Ativa";
        }

        return aposentado;
    }

    @Override
    public String toString() {
        return "Jogador --> " +
                "nome = " + nome + '\'' +
                ", posicao = " + posicao + '\'' +
                ", nascimento = " + nascimento +
                ", idade = " + calcularIdade() + "anos" +
                ", aposentado = " + aposentar();
    }
}
