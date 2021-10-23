package test;
import java.util.Scanner;

public class Multiplos {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira os dois numeros desejados: ");
        int num1 = entrada.nextInt();
        int num2 = entrada.nextInt();

        if (num1 % num2 == 0 || num2 % num1 == 0){
            System.out.println("Sao multiplos");
        }else {
            System.out.println("Nao sao multiplos");
        }

        entrada.close();
    }
}
