package exercicios_secao5;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Hora inicial: ");
        int horaInicial = in.nextInt();
        System.out.print("Hora final: ");
        int horaFinal = in.nextInt();
        int dif;
        if(horaInicial == horaFinal){
            dif = 24;
            System.out.println("O JOGO DUROU " + dif + " HORA(S)");
        } else if (horaInicial < horaFinal) {
            dif = horaFinal - horaInicial;
            System.out.println("O JOGO DUROU " + dif + " HORA(S)");
        } else {
            dif = (24 - horaInicial) + horaFinal;
            System.out.println("O JOGO DUROU " + dif + " HORA(S)");
        }
        in.close();
    }
}
