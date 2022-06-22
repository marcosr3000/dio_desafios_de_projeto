package main;

import java.util.Random;

public class Ex10_Arrays_Multidimensionais {

    public static void main(String[] args) {
        Random random = new Random();

        int[][] M = new int[4][4];

        for(int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                M[i][j] = random.nextInt(9);
            }
        }
        System.out.println("Matriz: ");
        for (int[] linha : M) {
            for (int coluna: linha) {
                System.out.print(coluna + " ");

            }
            System.out.println();
        }

        int num = 5, count = 1;
        do {
            //++count;
            num += count;
            System.out.println(num);
        } while (count <= 3);

        int num = 5, count = 1;
            while(count <= 3) {
                ++count;
                num += count;
            }
        System.out.println(num);
    }

}
