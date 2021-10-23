package test;
import java.util.Scanner;

public class Consumo {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira a kilometragem: ");
        double a = entrada.nextInt();
        System.out.println("Insira o gasto em combustivel em litros: ");
        double b = entrada.nextInt();
        double consumo = a / b;
        
        System.out.printf("O consumo medio de combustivel e: %.2f Km/L\n", consumo);
        entrada.close();
    }
}
