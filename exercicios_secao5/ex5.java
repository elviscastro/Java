package exercicios_secao5;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cod = in.nextInt();
        int qtd = in.nextInt();
        if(cod == 1){
            System.out.printf("Total: R$ %.2f", (float)(4 * qtd));
        } else if (cod == 2){
            System.out.printf("Total: R$ %.2f", (float)(4.5 * qtd));
        } else if (cod == 3){
            System.out.printf("Total: R$ %.2f", (float)(5 * qtd));
        } else if (cod == 4){
            System.out.printf("Total: R$ %.2f", (float)(2 * qtd));
        } else if (cod == 5){
            System.out.printf("Total: R$ %.2f", (float)(1.5 * qtd));
        }
        in.close();
    }
}
