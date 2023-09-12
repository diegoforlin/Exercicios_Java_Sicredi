package src;

import java.util.Scanner;

public class Exercicio03Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double numero1 = 0;
        double numero2 = 0;
        double numero3 = 0;

        System.out.println("Bem-vindo/a! Você irá digitar três números reais.Escolha um número real para começar.");
        numero1 = scan.nextDouble();
        System.out.println("Escolha o segundo número real.");
        numero2 = scan.nextDouble();
        System.out.println("Escolha o terceiro número real.");
        numero3 = scan.nextDouble();

        double mediaAritmetica = (numero1 + numero2 + numero3) / 3;

        System.out.println("O maior número é " + Math.max(numero1, Math.max(numero2, numero3)));
        System.out.println("e a sua média aritmética é " + mediaAritmetica);
    }
}
