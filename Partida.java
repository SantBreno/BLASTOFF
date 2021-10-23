package test;
import java.util.Scanner;

public class Partida {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int a = entrada.nextInt();
        int b = entrada.nextInt();

        if (a > b){
            System.out.printf("O jogo durou %d hora(s)\n", 24 - (a - b));
        }else if(b > a){
            System.out.printf("O jogo durou %d hora(s)\n", (b - a));
        }else{                                              //Quando a = b;
            System.out.printf("O jogo durou 24 hora(s)");
        }
        entrada.close();
    }
}