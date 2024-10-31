package matrizes.atividade_03;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int[] soma = {0, 0};

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("Digite o valor na linha %s e coluna %s: ", i + 1, j + 1);
                matriz[i][j] = read.nextInt();
            }

        }
        System.out.println("\n");
        System.out.println("Elementos da Diagonal Principal:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    String console = String.format("%s        ", matriz[i][j]);
                    System.out.print(console.substring(0, 3));
                    soma[0] += matriz[i][j];
                }
            }
        }
        System.out.println("\n");
        System.out.println("Elementos da Diagonal Secundária:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i + j == matriz.length - 1) {
                    String console = String.format("%s        ", matriz[i][j]);
                    System.out.print(console.substring(0, 3));
                    soma[1] += matriz[i][j];
                }
            }
        }
        System.out.println("\n");
        System.out.printf("""   
                Soma dos Elementos da Diagonal Principal:
                %s
                
                Soma dos Elementos da Diagonal Secundária:
                %s
                """, soma[0], soma[1]);
    }
}
