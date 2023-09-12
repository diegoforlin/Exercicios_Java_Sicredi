package src;
import java.util.Scanner;

public class Exercicio07Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int idade = 0;
        String nome = "";
        int renda = 0;

        System.out.println("Bem-vindo/a ao cadastro de consórcio. Por favor, digite o seu nome:");
        nome = scan.nextLine();
        System.out.println("É um prazer recebê-lo/a, " + nome + ".");
        System.out.println("Por favor, digite a sua idade.");
        idade = scan.nextInt();
        System.out.println("Por fim, digite a sua renda mensal..");
        renda = scan.nextInt();

        if (renda >= 2000 && idade >= 18) {
            System.out.println("Parabéns, consórcio aprovado!");
        } else {
            System.out.println("Sinto muito, recusamos o seu consórcio...");
        }
    }
}
