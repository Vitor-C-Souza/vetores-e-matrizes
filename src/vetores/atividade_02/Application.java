package vetores.atividade_02;

import java.io.PrintStream;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int[] vetor = new int[10];
        StringBuilder indiceImpar = new StringBuilder();
        StringBuilder indicePar = new StringBuilder();

        int soma = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o " + (i + 1) + "º numero:");
            vetor[i] = read.nextInt();

            soma += vetor[i];

            if (vetor[i] % 2 == 0)
                indicePar.append(vetor[i]).append(" ");
        }

        for (int i = 1; i < vetor.length; i = i + 2) {
            indiceImpar.append(vetor[i]).append(" ");
        }

        System.out.println("\n");
        PrintStream printf = System.out.printf("""
                Elementos nos índices ímpares:
                %s
                
                
                Elementos pares:
                %s
                
                
                Soma: %s
                
                
                Média: %.2f
                """, indiceImpar, indicePar, soma, ((float) soma / vetor.length));
    }
}
