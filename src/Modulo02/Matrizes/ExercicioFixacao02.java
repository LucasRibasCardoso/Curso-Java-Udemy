package Modulo02.Matrizes;

import java.util.Scanner;

/**
 * Fazer um programa para ler dois números inteiros M e N, e depois ler
 * uma matriz de M linhas por N colunas contendo números inteiros,
 * podendo haver repetições. Em seguida, ler um número inteiro X que
 * pertence à matriz. Para cada ocorrência de X, mostrar os valores à
 * esquerda, acima, à direita e abaixo de X, quando houver.
 */

public class ExercicioFixacao02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many lines? ");
        int line = sc.nextInt();

        System.out.print("How many columns? ");
        int column = sc.nextInt();

        int[][] matriz = new int[line][column];

        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j < matriz[i].length ; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("What number do you want to find? ");
        int target = sc.nextInt();

        for (int i=0; i<matriz.length; i++) {
            for (int j=0; j<matriz[i].length; j++) {
                if (matriz[i][j] == target) {
                    System.out.println("Position " + i + "," + j + ":");
                    if (j > 0) {
                        System.out.println("Left: " + matriz[i][j-1]);
                    }
                    if (i > 0) {
                        System.out.println("Up: " + matriz[i-1][j]);
                    }
                    if (j < matriz[i].length-1) {
                        System.out.println("Right: " + matriz[i][j+1]);
                    }
                    if (i < matriz.length-1) {
                        System.out.println("Down: " + matriz[i+1][j]);
                    }
                }
            }
        }
        sc.close();
    }
}
