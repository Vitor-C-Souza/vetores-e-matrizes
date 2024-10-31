package matrizes.atividade_04;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        float[][] notas = new float[10][4];
        float[] media = new float[10];


        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("Digite a nota do %sº aluno no %sº bimestre:", i + 1, j + 1);
                notas[i][j] = read.nextFloat();
                if (j == 0)
                    media[i] = notas[i][j];
                else
                    media[i] += notas[i][j];
            }
            media[i] /= 4;
        }

        System.out.println("\n");
        for (int i = 0; i < media.length; i++) {
            System.out.printf("A média do %sº aluno é: %.1f \n", i + 1, media[i]);
        }
    }
}
