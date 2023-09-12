package src;

import java.util.Scanner;

public class Exercicio04Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float salarioMinimo = 1320;
        float salarioUsuario = 0;
        float salarioAtualizado = (salarioUsuario / salarioMinimo);
        String nomeUsuario = "";

        System.out.println("Bem-vindo/a à calculadora de salário. Por favor, digite o seu nome:");
        nomeUsuario = scan.nextLine();
        System.out.println("É um prazer recebê-lo/a, " + nomeUsuario + ".");
        System.out.print("Insira o seu salário sem casas decimais " + nomeUsuario + ", por favor, informações confidenciais.");
        salarioUsuario = scan.nextFloat();
        salarioAtualizado = salarioUsuario / salarioMinimo;
        System.out.print("Você digitou o salário de " + salarioUsuario + ". O salário mínimo atual" +
                " é de " + salarioMinimo + " .");
        System.out.println("Você ganha aproximadamente " + salarioAtualizado + " salários-mínimos.");

    }

}
