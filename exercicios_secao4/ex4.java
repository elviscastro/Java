package exercicios_secao4;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite matricula: ");
        int matricula = in.nextInt();
        System.out.print("Digite horas trabalhadas: ");
        int horasTrabalhadas = in.nextInt();
        System.out.print("Digite o valor por hora: R$");
        double salario = in.nextDouble();
        System.out.println("NUMBER = " + matricula);
        System.out.println("SALARY = R$" + (horasTrabalhadas * salario));
        in.close();
    }
}
