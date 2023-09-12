package src;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Exercicio08Main {

    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int opcao = 0;

            while (true) {
                System.out.println("## Escolha uma das opções abaixo ##");
                System.out.println("Opção 1 - Gestante");
                System.out.println("Opção 2 - Deficiente");
                System.out.println("Opção 3 - Idosa/o");
                System.out.println("Opção 4 - Nenhuma das alternativas");

                System.out.print("Digite aqui sua opção: ");
                opcao = Integer.parseInt(sc.nextLine());

                if (opcao == 4) {
                    System.out.println("Você não tem direito à fila preferencial");
                    return;
                } else {
                    System.out.println("Você tem direito à fila preferencial.");
                    return;
                }
            }
        }
    }