package exercicios_secao5;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int x = in.nextInt();
        if (x % 2 == 0) {
            System.out.println("PAR");
        } else {
            System.out.println("IMPAR");
        }
        in.close();
    }
}
