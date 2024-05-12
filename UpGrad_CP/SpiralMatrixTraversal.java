package UpGrad_CP;

import java.util.Scanner;

public class SpiralMatrixTraversal {
    public static void main(String[] args) {
        // Getting the matrix input here.
        Scanner input = new Scanner(System.in);
        int row = input.nextInt();
        int col = input.nextInt();
        int[][] matrix = new int[row][col];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
        // Performing the spiral traversal here.
        int min_row = 0;
        int min_col = 0;
        int max_row = matrix.length - 1;
        int max_col = matrix[0].length - 1;
        int totalElement = row * col;
        int counter = 0;
        // Printing the boxes or 4 walls here.
        while (counter < totalElement) { // Add termination condition
            // Left wall. col same, row++, up to down movement.
            for (int i = min_row; i <= max_row && counter < totalElement; i++) {
                System.out.println(matrix[i][min_col]);
                counter++;
            }
            min_col++; // Avoiding corner repetition
            // Bottom wall. row same, col++, left to right movement.
            for (int j = min_col; j <= max_col && counter < totalElement; j++) {
                System.out.println(matrix[max_row][j]);
                counter++;
            }
            max_row--; // Avoiding corner repetition
            // Right wall. col same, row--, bottom to up movement.
            for (int i = max_row; i >= min_row && counter < totalElement; i--) {
                System.out.println(matrix[i][max_col]);
                counter++;
            }
            max_col--; // Avoiding corner repetition
            // Top wall. row same, col--, right to left movement.
            for (int j = max_col; j >= min_col && counter < totalElement; j--) {
                System.out.println(matrix[min_row][j]);
                counter++;
            }
            min_row++; // For the next inner window.
        }
    }
}

