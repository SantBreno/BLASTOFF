package test;
import java.util.Scanner;

public class Lista {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        int tam;
        System.out.println("Insira o tamanho do vetor: ");
        tam = entrada.nextInt();
        int vetor[] = new int[tam];
        
        System.out.println("Insira os numeros do vetor: ");
        for (int cont = 0; cont < tam; cont++){
            vetor[cont] = entrada.nextInt();
        }

        System.out.println("Os numeros pares do vetor sao: ");
        for (int cont = 0; cont < tam; cont++){
            if(vetor[cont] % 2 == 0){
                System.out.println(vetor[cont] + " ");
            }
        } 
        entrada.close();
        }  
    }