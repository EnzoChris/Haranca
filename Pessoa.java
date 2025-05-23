package Treino;

public class Pessoa {
    private boolean cabelo;
    private int idade;
    private double altura;



    //construtor
    public Pessoa ( boolean cabelo, int idade, double altura){
        this.cabelo = cabelo;
        this.idade = idade;
        this.altura = altura;
    }

    //toString
    public String toString(){
        return "Tem cabelo: "+this.cabelo+"\nIdade: "+this.idade+"\nAltura: "+this.altura;
    }

    //métodos getters
    public double getAltura() {
        return altura;
    }

    public int getIdade() {
        return idade;
    }

    public boolean getCabelo() {
        return cabelo;
    }



    //metodos normais
    public void altura(){
        System.out.println("Altura: "+this.altura);
    }



}
