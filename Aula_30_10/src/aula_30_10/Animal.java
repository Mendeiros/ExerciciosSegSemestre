package aula_30_10;

import javax.swing.JOptionPane;

public class Animal {
    // atributos
    String nome;
    String especie;
    float peso;
    String cor;
    int idade;
    
    // construtor default
    public Animal(){
    }
    
    public Animal(String nome, String especie, float peso, String cor, int idade){
        this.nome = nome;
        this.especie = especie;
        this.peso = peso;
        this.cor = cor;
        this.idade = idade;
    }
    
    public Animal(String nome, String especie){
        this.nome = nome;
        this.especie = especie;
    }
    
    public void alimentar(){
        JOptionPane.showMessageDialog(null, "O animal está se alimentando");
    }
    
    public String movimentar(){
        String move = JOptionPane.showInputDialog("Como ele se movimenta?");
        return move;
    }
    
    public float calcularTamanho(float comprimento, float largura){
        float tamanho = comprimento * largura;
        return tamanho;
    }
}
