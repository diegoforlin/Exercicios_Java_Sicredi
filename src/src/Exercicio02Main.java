package src;

import java.util.Scanner;

public class Exercicio02Main {

    public static void main(String[] args) {

        float numero1 = 0;
        float numero2 = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Olá, digite o primeiro número que você deseja imprimir. Strings quebrarão o console.");

        if (scan.hasNextFloat()) {
            numero1 = scan.nextFloat();
        } else {
            System.out.println("Apenas números reais são aceitos, e não strings.");
            return;
        }

        System.out.println("Agora, digite o segundo número que você deseja imprimir:");

        if (scan.hasNextFloat()) {
            numero2 = scan.nextFloat();
        } else {
            System.out.println("Apenas números reais são aceitos, e não strings.");
            return;
        }
        System.out.println("Você imprimiu os números " + numero1 + " e " + numero2);
    }
}





