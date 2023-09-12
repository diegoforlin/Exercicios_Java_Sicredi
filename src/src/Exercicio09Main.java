package src;
import java.util.Scanner;


public class Exercicio09Main {

    public static void main (String args[] ) {
        int i,count;
        System.out.print("Entre um valor de número natural (começando do 0): ");
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Os números primos de " + 0 + " até " + n + " são:");
        for(int j = 2; j <= n ; j++)
        {
            count = 0;
            for(i = 1; i <= j; i++)
            {
                if(j%i == 0)
                {
                    count++;
                }
            }
            if (count == 2)
                System.out.print(j +  "  ");
        }
    }
}