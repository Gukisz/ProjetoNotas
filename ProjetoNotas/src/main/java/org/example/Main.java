package org.example;

public class Main {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante("Maria", 85);
        System.out.println(AvaliadorDeNotas.avaliarEstudante(estudante1));

        Estudante estudante2 = new Estudante("João", 95);
        System.out.println(AvaliadorDeNotas.avaliarEstudante(estudante2));

        Estudante estudante3 = new Estudante("Pedro", 40);
        System.out.println(AvaliadorDeNotas.avaliarEstudante(estudante3));

        Estudante estudante4 = new Estudante("Ana", 20);
        System.out.println(AvaliadorDeNotas.avaliarEstudante(estudante4));
    }
}