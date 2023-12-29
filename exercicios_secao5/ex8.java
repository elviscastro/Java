package exercicios_secao5;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float salario = in.nextFloat();
        if(salario <= 2000){
            System.out.println("Isento");
        } else if (salario <= 3000){
            System.out.printf("R$ %.2f", ((salario-2000)*0.08));
        } else if (salario <= 4500){
            System.out.printf("R$ %.2f", ((salario-3000)*0.18 + (1000*0.08)));
        } else {
            System.out.printf("R$ %.2f", ((salario-4500)*0.28)+(1500*0.18)+(1000*0.08));
        }
        in.close();
    }
}
