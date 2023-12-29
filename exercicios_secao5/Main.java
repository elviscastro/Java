package exercicios_secao5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Quantas horas?");
        int hora = in.nextInt();

        if (hora < 12) {
            System.out.println("Bom dia");
        } else if (hora < 18) {
            System.out.println("Boa tarde");
        } else {
            System.out.println("Boa noite");
        }

        in.close();
    }
}
