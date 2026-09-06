package ufes.br.model;

public class Resultado {

    private String nome;
    private double valorCalculado;

    public Resultado(String nome, double valorCalculado) {
        this.nome = nome;
        this.valorCalculado = valorCalculado;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\n" +
               "Valor: " + valorCalculado + "\n";
    }

    // outros métodos...
}
