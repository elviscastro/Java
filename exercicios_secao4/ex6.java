package exercicios_secao4;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float A = in.nextFloat();
        float B = in.nextFloat();
        float C = in.nextFloat();
        System.out.printf("TRIANGULO: %.3f\n", ((A*C)/2));
        System.out.printf("CIRCULO: %.3f\n", (Math.PI*Math.pow(C, 2)));
        System.out.printf("TRAPEZIO: %.3f\n", ((A+B)*C)/2);
        System.out.printf("QUADRADO: %.3f\n", Math.pow(B, 2));
        System.out.printf("RETANGULO: %.3f", A*B);
        in.close();
    }
}
