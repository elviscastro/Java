package exercicios_secao5;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float num = in.nextFloat();
        if(num >= 0 && num  <= 25){
            System.out.println("Invervalo [0,25]");
        } else if (num > 25 && num <= 50){
            System.out.println("Invervalo (25,50]");
        } else if (num > 50 && num <= 75){
            System.out.println("Invervalo (50,75]");
        } else if (num > 75 && num <= 100){
            System.out.println("Invervalo (75,100]");
        } else {
            System.out.println("Fora de intervalo");
        }
        in.close();
    }
}
