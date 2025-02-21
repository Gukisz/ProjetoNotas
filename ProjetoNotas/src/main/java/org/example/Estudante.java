package org.example;

public class Estudante {
    private String nome;
    private double notaFinal;

    // Construtor para inicializar o nome e a nota final do estudante
    public Estudante(String nome, double notaFinal) {
        this.nome = nome;
        this.notaFinal = notaFinal;
    }

    // Getter para obter o nome do estudante
    public String getNome() {
        return nome;
    }

    // Getter para obter a nota final do estudante
    public double getNotaFinal() {
        return notaFinal;
    }
}
