package exercicios_secao4;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor do raio: ");
        double raio = sc.nextDouble();
        System.out.println("A = " + Math.PI * Math.pow(raio,2));
        sc.close();
    }
}
