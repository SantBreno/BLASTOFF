package test;
import java.util.Scanner;

public class Primo {
    public static void main(String[] args){
    Scanner entrada = new Scanner(System.in);
    int i, j, k, n;
    System.out.println("Insira o tamanho do vetor: ");
    int tam = entrada.nextInt();
    
    System.out.println("Insira os numeros do vetor: ");
    for (i = 0; i < tam; i++){
        j = 0;
        n = entrada.nextInt();
        for (k = 2; k < n; k++){
            if (n % k == 0) {
                j++;
            }
        }
        if(j == 0){
            System.out.printf("%d e primo\n", n);
        }else{
            System.out.printf("%d nao e primo\n", n);
        }
    }
    

    entrada.close();
        }
    }