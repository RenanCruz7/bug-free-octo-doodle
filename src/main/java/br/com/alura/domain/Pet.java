package br.com.alura.domain;

public class Pet {

    public Pet(String tipo, String nome, String raca, int idade, String cor, float peso) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
        this.cor = cor;
        this.peso = peso;
        this.tipo = tipo;
    }

    String nome;
    String raca;
    int idade;
    String cor;
    float peso;
    String tipo;
}
