package test;
import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Insira o numero que voce deseja receber a tabuada: ");
        int num = entrada.nextInt();

        for (int cont = 0; cont <= 10; cont++){
            System.out.printf("%d x %d = %d\n", num, cont, num * cont);
        }
        entrada.close();
    }
}
