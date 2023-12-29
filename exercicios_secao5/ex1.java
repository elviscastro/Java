package exercicios_secao5;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int x = in.nextInt();
        if (x < 0) {
            System.out.println("NEGATIVO");
        } else {
            System.out.println("POSITIVO");
        }
        in.close();
    }
}
