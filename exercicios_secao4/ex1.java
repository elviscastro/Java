package exercicios_secao4;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        int n1 = sc.nextInt();
        System.out.print("Digite o segundo numero: ");
        int n2 = sc.nextInt();
        System.out.print("SOMA = "+(n1+n2));
        sc.close();
    }
}
