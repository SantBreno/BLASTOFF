package test;
import java.util.Scanner;

public class MenorNumero {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira os 3 numeros desejados: ");
        int a = entrada.nextInt();
        int b = entrada.nextInt();
        int c = entrada.nextInt();
        int menor;

        if (a <= b && a <= c) {
            menor = a;
        }else if (b <= c && b <= a) {
            menor = b;
        }else {
            menor = c;
        }

        System.out.println("O menor numero eh: " + menor);
        entrada.close();
    }
}
