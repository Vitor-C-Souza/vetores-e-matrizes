package vetores.atividade_01;

import java.util.Arrays;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int[] vetor = {2,5,1, 3, 4, 9, 7, 8, 10, 6};

        System.out.println(Arrays.toString(vetor));

        System.out.println("Digite o número que você deseja encontrar: ");
        int numero = read.nextInt();
        boolean encontrado = false;

        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] == numero){
                System.out.printf("O número %s está localizado na posição: %s\n", numero, i);
                encontrado = true;
                break;
            }
        }

        if(!encontrado){
            System.out.printf("O número %s não foi encontrado!", numero);
        }
    }
}
