package br.inatel.banco.model;

public class Pagamentos {
    private double valor;
    private String nome;
    private String operacao;

    // right bottom >> Generate >> construtor
    public Pagamentos(double valor, String nome, String operacao) {
        this.valor = valor;
        this.nome = nome;
        this.operacao = operacao;
    }

    // rigth bottom >> Generate >> Getter
    public double getValor() {
        return valor;
    }

    public String getNome() {
        return nome;
    }

    public String getOperacao() {
        return operacao;
    }
}
