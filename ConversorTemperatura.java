package test;
import java.util.Scanner;

public class ConversorTemperatura {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira a temperatura em Celsius: ");
        double temperatura = entrada.nextDouble();
        temperatura = (temperatura * 9 / 5.0) + 32;
        
        System.out.println("Temperatura em Fahrenheit: " + temperatura);
        entrada.close();
    }
}