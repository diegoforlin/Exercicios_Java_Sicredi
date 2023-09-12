package src;

import java.util.Scanner;

public class Exercicio15Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int persas = 300000;
        int palpites;
        int tentativas = 0;

        System.out.print("Espartano/a! Quantos persas você acha que iremos enfrentar?");
        System.out.println();
        palpites = scan.nextInt();

        while (palpites != persas) {
            if (palpites > persas) {
                System.out.print("Um pouco menos!");
                tentativas += 1;
                palpites = scan.nextInt();
            }
            else if (palpites < persas) {
                System.out.print("Um pouco mais!");
                tentativas +=1;
                palpites = scan.nextInt();
            }
        }

        System.out.println("Você acertou!!!");
        System.out.print(persas + " é a resposta correta e você demorou " + tentativas + " tentativas para acertar!");
    }
}