package src;
import java.util.Scanner;

public class Exercicio06Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int idade = 0;
        String nome = "";

        System.out.println("Bem-vindo/a ao cadastro de votação. Por favor, digite o seu nome:");
        nome = scan.nextLine();
        System.out.println("É um prazer recebê-lo/a, " + nome + ".");
        System.out.println("Digite a sua idade.");

        idade = scan.nextInt();

        if (idade < 16) {
            System.out.println("Você não pode votar.");
        } else if (idade >= 16 && idade <= 17) {
            System.out.println("Seu voto é facultativo!");
        } else if (idade >= 18 && idade < 65) {
            System.out.println("Você é obrigado a votar. Sinto muito.");
        } else {
            System.out.println("Não precisa votar.");
        }
    }
}
