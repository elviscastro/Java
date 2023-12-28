import java.util.Scanner;

public class entradaDeDados {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String texto = sc.next();
        System.out.println("Voce digitou: " + texto);

        double salario = sc.nextDouble();
        System.out.println("Voce digitou: R$" + salario);

        sc.close();    
    }

}
