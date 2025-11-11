package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificacao;

public class Filme extends Titulo implements Classificacao {
    private String diretor;
    private int duracaoEmMinutos;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    @Override
    public int getClassificacao() {
        return (int) retornaMedia() / 2;
    }
}