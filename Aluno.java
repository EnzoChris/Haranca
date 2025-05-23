package Treino;

public class Aluno extends Pessoa{
    private String nome;
    private int primNota;

    //construtor
    public Aluno (boolean cabelo, int idade, double altura, String nome, int primNota){


        super(cabelo, idade, altura);//chamando o construtor da classe pessoa


        this.primNota = primNota;
        this.nome = nome;
    }
    //toString
    public String toString(){
        return "nome: "+this.nome+"\nprimeira nota: "+this.primNota+"\ncaracterísticas da pessoa: "+super.toString();
    }



    //getters

    public String getNome() {
        return nome;
    }

    public int getPrimNota() {
        return primNota;
    }

    @Override
    public boolean getCabelo() {
        return super.getCabelo();
    }

    @Override
    public double getAltura() {
        return super.getAltura();
    }

    @Override
    public int getIdade() {
        return super.getIdade();
    }
}
