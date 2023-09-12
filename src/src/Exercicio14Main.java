package src;

import java.util.Scanner;

public class Exercicio14Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String resposta;
        System.out.println("Bem-vindo/a! Você irá digitar letras, palavras ou frases e este programa irá imprimir ao contrário.");

        while (true) {
            resposta = scan.nextLine();
            for (String part : resposta.split(" ")) {
                System.out.print(new StringBuilder(part).reverse().toString());
                System.out.print(" ");
            }

            System.out.println();
            System.out.println("Digite 0 para encerrar o programa ou continue brincando com Strings");
            if (resposta.equals("0")) {
                break;
            }
        }
    }
}