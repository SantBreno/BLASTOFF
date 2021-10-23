package test;
import java.util.Scanner;

public class Idades {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        int i = entrada.nextInt();
        int j = entrada.nextInt();
        int k = entrada.nextInt();
        int x = entrada.nextInt();
        int y = entrada.nextInt();
        double media = (i + j + k + x + y) / 5.0;

        System.out.println(media);
        entrada.close();
    }
}
