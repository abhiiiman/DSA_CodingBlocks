package Arrays;

import java.util.Scanner;

public class WaveArray {
    public static void main(String[] args) {
        int rows = 4;
        int cols = 4;
        int[][] array = new int[rows][cols];
        array = new int[][]{
                {11, 12, 13, 14},
                {21, 22, 23, 24},
                {31, 32, 33, 34},
                {41, 42, 43, 44}
        };
        wave(array, rows, cols);
    }

    public static void wave(int[][] array, int rows, int cols) {
        for (int c = 0; c < cols; c++) {
            if (c%2==0){
                for (int r = 0; r < rows; r++) {
                    System.out.print(array[r][c] + " ");
                }
                System.out.print(" | ");
            }
            else{
                for (int r = rows-1; r >= 0; r--) {
                    System.out.print(array[r][c] + " ");
                }
                System.out.print(" | ");
            }
        }
    }
}
