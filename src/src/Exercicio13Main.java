package src;

import java.util.Scanner;

public class Exercicio13Main {

    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        String resposta;

        while (true) {
            System.out.println("Bem-vindo/a! Você irá digitar letras, palavras ou frases e este programa irá dividir pela metade.");
            resposta = scan.nextLine();

            int meio = resposta.length() / 2;

            String primeiraMetade = resposta.substring(0, meio);
            String segundaMetade = resposta.substring(meio);

            System.out.println("A primeira metade é: " + primeiraMetade);
            System.out.println("A segunda metade é: " + segundaMetade);

            System.out.println("Digite 0 para encerrar o programa ou 1 para reiniciar:");

            String opcao = scan.nextLine();

            if (opcao.equals("0")) {
                break;
            } else if (!opcao.equals("1")) {
                break;
            }
        }
        System.out.println("Encerrando o programa.");
    }
}
