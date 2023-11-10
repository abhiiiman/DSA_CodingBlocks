package Arrays;

import java.util.Scanner;

public class SpiralArray {
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
        spiral(array, rows, cols);
    }

    public static void spiral(int[][] array, int rows, int cols) {
        int minRow = 0;
        int minCol = 0;
        int maxCol = array[0].length-1;
        int maxRow = array.length-1;
        int totalCount = rows * cols;
        int count = 0;
        while (minRow <= maxRow && minCol <= maxCol){
            for (int r = minRow; r <= maxRow && count < totalCount; r++) {
                System.out.print(array[r][minCol] + " ");
                count++;
            }
            System.out.println();
            for (int c = minCol + 1; c <= maxCol && count < totalCount; c++) {
                System.out.print(array[maxRow][c] + " ");
                count++;
            }
            System.out.println();
            for (int r = maxRow-1; r >= minRow && count < totalCount; r--) {
                System.out.print(array[r][maxCol] + " ");
                count++;
            }
            System.out.println();
            for (int c = maxCol - 1; c >= minCol+1 && count < totalCount; c--) {
                System.out.print(array[minRow][c] + " ");
                count++;
            }
            System.out.println();
            minRow++;
            maxRow--;
            minCol++;
            maxCol--;
        }
    }
}
