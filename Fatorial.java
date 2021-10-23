package test;
import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int fatorial = 1;

        System.out.println("Insira o numero fo fatorial que deseja: ");
        int num = entrada.nextInt();
        
        for (int cont = num; cont >= 1; cont--){
            fatorial *= cont;
        }
        System.out.printf("%d\n", fatorial);
        entrada.close();
    }
}