package src;

import java.util.Scanner;

public class Exercicio01Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Bem-vindo/a ao programa de nome. Por favor, digite o seu nome:");
            String nome = scan.nextLine();

            if (nome.equals("0")) {
                System.out.println("Obrigado por testar o programa e até a próxima!");
                System.exit(0);
            }

            System.out.println("É um prazer recebê-lo/a, " + nome + ". " +
                    "Esperamos que aproveite este pequeno código e até mais. " +
                    "Ah, antes que eu me esqueça, digite 0 (Zero) para encerrar o programa.");

            String resposta = scan.nextLine();

            if (resposta.equals("0")) {
                System.out.println("Obrigado por testar o programa e até a próxima!");
                System.exit(0);
            } else {
                System.out.println("Perdão, não entendi, digite 0 para sair do programa.");
            }
        }}}