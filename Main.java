package Treino;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Aluno aluno = new Aluno(true, 14, 1.78, "Enzo", 9);

        System.out.println(aluno);

        //vamos mudar os valores agora
        //    criando variáveis
        boolean cabelo;
        int idade;
        double altura;
        String nome;
        int nota;

        int resposta;
        int sair = 0;


        //perguntando novos valores
    while (sair != 1) {
        try {

            System.out.println("Qual o seu nome? ");
            nome = input.nextLine();


            System.out.println("Você tem cabelo? true or false: ");
            cabelo = input.nextBoolean();
            input.nextLine();
            while (cabelo != true && cabelo != false) {
                System.out.println("Você tem cabelo? true or false: ");
                cabelo = input.nextBoolean();
                input.nextLine();
            }

            System.out.println("Qual a sua idade: ");
            idade = input.nextInt();
            while (idade < 0) {
                System.out.println("Qual a sua idade: ");
                idade = input.nextInt();
            }

            System.out.println("Qual a sua altura: ");
            altura = input.nextDouble();
            while (altura < 0 && altura < 3) {
                System.out.println("Qual a sua altura: ");
                altura = input.nextDouble();
            }


            System.out.println("Qual a sua nota: ");
            nota = input.nextInt();
            input.nextLine();
            while (nota < 0 && nota <= 10) {
                System.out.println("Qual a sua nota: ");
                nota = input.nextInt();
                input.nextLine();
            }

            Aluno aluno2 = new Aluno(cabelo, idade, altura, nome, nota);
            System.out.println(aluno2);


            System.out.println("\n\n\n");
            //menu pra sair
            System.out.println("*********************************************");
            System.out.println("             Agora é o Menu bicho!           ");
            System.out.println("**********************************************");
            System.out.println("\n\n\n\n");
            System.out.println("[1]sair");
            System.out.println("[2]fazer de novo");
            System.out.println("resposta: ");
            resposta = input.nextInt();

            //verificação
            if (resposta == 1) {
                sair++;
            } else if (resposta == 2) {
                System.out.println("Qual o seu nome? ");
                nome = input.nextLine();
                input.nextLine();

                System.out.println("Você tem cabelo? true or false: ");
                cabelo = input.nextBoolean();
                input.nextLine();
                while (cabelo != true && cabelo != false) {
                    System.out.println("Você tem cabelo? true or false: ");
                    cabelo = input.nextBoolean();
                    input.nextLine();
                }

                System.out.println("Qual a sua idade: ");
                idade = input.nextInt();
                while (idade < 0) {
                    System.out.println("Qual a sua idade: ");
                    idade = input.nextInt();
                }

                System.out.println("Qual a sua altura: ");
                altura = input.nextDouble();
                while (altura < 0 && altura < 3) {
                    System.out.println("Qual a sua altura: ");
                    altura = input.nextDouble();
                }


                System.out.println("Qual a sua nota: ");
                nota = input.nextInt();
                input.nextLine();
                while (nota < 0 && nota <= 10) {
                    System.out.println("Qual a sua nota: ");
                    nota = input.nextInt();
                    input.nextLine();
                }

                Aluno aluno3 = new Aluno(cabelo, idade, altura, nome, nota);
                System.out.println(aluno3);

                System.out.println("\n\n\n");
                //menu pra sair
                System.out.println("*********************************************");
                System.out.println("             Agora é o Menu bicho!           ");
                System.out.println("**********************************************");
                System.out.println("\n\n\n\n");
                System.out.println("[1]sair");
                System.out.println("[2]fazer de novo");
                System.out.println("resposta: ");
                resposta = input.nextInt();

            } else {
                while (resposta == 1 && resposta == 2) {
                    System.out.println("*********************************************");
                    System.out.println("             Agora é o Menu bicho!           ");
                    System.out.println("**********************************************");
                    System.out.println("\n\n\n\n");
                    System.out.println("[1]sair");
                    System.out.println("[2]fazer de novo");
                    System.out.println("resposta: ");
                    resposta = input.nextInt();

                }
            }


        } catch (InputMismatchException ime) { //vendo as exceções
            System.out.println("Digite o tipo certo bixo!");
            input.nextLine();
        }
    }

    }
}
