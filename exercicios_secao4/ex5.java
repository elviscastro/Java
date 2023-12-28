package exercicios_secao4;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite codigo da peça 1: ");
        int cod1 = in.nextInt();
        System.out.print("Digite a quantidade da peça "+cod1+": ");
        int qnt1 = in.nextInt();
        System.out.print("Digite o valor da peça 1: R$");
        float valor1 = in.nextFloat();
        System.out.print("Digite codigo da peça 2: ");
        int cod2 = in.nextInt();
        System.out.print("Digite a quantidade de peça "+cod2+": ");
        int qnt2 = in.nextInt();
        System.out.print("Digite o valor da peça 2: R$");
        float valor2 = in.nextFloat();
        System.out.printf("VALOR A PAGAR: R$ %.2f", (valor1*qnt1+valor2*qnt2));
        in.close();
    }
}
