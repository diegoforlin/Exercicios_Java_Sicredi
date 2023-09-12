package src;

import java.util.Scanner;

public class Exercicio12Main {
    public int soma(int num1, int num2) {
        return num1 + num2;
    }

    public int subtracao(int num1, int num2) {
        return num1 - num2;
    }

    public int multiplicacao(int num1, int num2) {
        return num1 * num2;
    }

    public int divisao(int num1, int num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Erro: Divisão por zero.");
            return 0;
        }
    }

    public static void main(String arg[] ) {
        Exercicio12Main calc = new Exercicio12Main();

        int opcao;
        int num1;
        int num2;

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("-Escolha uma opção-");
            System.out.println("1. Soma");
            System.out.println("2. Subtracao");
            System.out.println("3. Multiplicacao");
            System.out.println("4. Divisao");
            System.out.println("0. Sair");
            System.out.println("Operação: ");

            opcao = input.nextInt();

            if (opcao == 0) {
                System.out.println("Obrigado por usar a calculadora de Java.");
                break;
            }

            Scanner input1 = new Scanner(System.in);

            System.out.println("Qual o primeiro numero: ");
            num1 = input1.nextInt();
            System.out.println("Qual o segundo numero: ");
            num2 = input1.nextInt();

            int resultado = 0;

            switch (opcao) {
                case 1:
                    resultado = calc.soma(num1, num2);
                    System.out.printf("\nO resultado da soma é: %d\n", resultado);
                    break;
                case 2:
                    resultado = calc.subtracao(num1, num2);
                    System.out.printf("\nO resultado da subtração é: %d\n", resultado);
                    break;
                case 3:
                    resultado = calc.multiplicacao(num1, num2);
                    System.out.printf("\nO resultado da multiplicação é: %d\n", resultado);
                    break;
                case 4:
                    resultado = calc.divisao(num1, num2);
                    System.out.printf("\nO resultado da divisão é: %d\n", resultado);
                    break;
                default:
                    System.out.println("Opção inválida");
            }

            System.out.println("Digite 1 para voltar ao menu ou 0 para encerrar o programa.");
            int escolha = input.nextInt();
            if (escolha == 0) {
                System.out.println("Obrigado por usar a calculadora de Java.");
                break;
            }
        }
    }
}
