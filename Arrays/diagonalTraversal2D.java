package Arrays;

import java.util.Scanner;

public class diagonalTraversal2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row = input.nextInt();
        int col = input.nextInt();
        int[][] myMatrix = new int[row][col];
        for (int r = 0; r < myMatrix.length; r++) {
            for (int c = 0; c < myMatrix[0].length; c++) {
                myMatrix[r][c] = input.nextInt();
            }
        }
        int[] resultArray = printDiagonal(myMatrix);
        for (int element : resultArray) {
            System.out.print(element + " ");
        }
    }
    public static int[] printDiagonal(int[][] matrix) {
        int row = 0, col = 0;
        int m = matrix.length, n = matrix[0].length;
        int i = 0;
        int[] array = new int[m*n];
        boolean up = true;
        while (row < m && col < n){
            // if the diagonal is going up.
            if (up){
                while (row > 0 && col < n-1){
                    array[i++] = matrix[row][col];
                    row--;
                    col++;
                }
//                to store the last element of the row
                array[i++] = matrix[row][col];
//                to change the direction - to downward
                if (col == n-1){ // last col encountered
                    row++;
                }
                else{
                    col++;
                }
            }
            // if the diagonal is going down.
            else {
                while (col > 0 && row < m-1){
                    array[i++] = matrix[row][col];
                    row++;
                    col--;
                }
//                to store the last element of the col
                array[i++] = matrix[row][col];
//                to change the direction - to upward
                if (row == m-1){ // last row encountered
                    col++;
                }
                else{
                    row++;
                }
            }
            // in each iteration the direction is changing from up to down and vice versa.
            up = !up;
        }
        return array;
    }
}
