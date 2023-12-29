package exercicios_secao5;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int x = in.nextInt();
        System.out.print("Digite um numero: ");
        int y = in.nextInt();
        if (x < y) {
            if (y % x == 0) {
                System.out.println("Sao Multiplos");
            } else {
                System.out.println("Nao sao Multiplos");
            }
        } else {
            if (x % y == 0) {
                System.out.println("Sao Multiplos");
            } else {
                System.out.println("Nao sao Multiplos");
            }
        }
        in.close();
    }
}
