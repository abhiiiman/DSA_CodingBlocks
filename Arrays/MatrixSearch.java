package Arrays;

import java.util.Scanner;

public class MatrixSearch {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        int n = scn.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        int k = scn.nextInt();
        System.out.print(searchMatrix(arr, k));
    }

    public static int searchMatrix(int[][] matrix, int target) {
        int rowIdx = searchPotentialMatrix(matrix, target);
        if (rowIdx != -1) {
            return binarySearchOverRow(rowIdx, matrix, target);
        } else {
            return 0;
        }
    }

    public static int searchPotentialMatrix(int[][] matrix, int target) {
        int low = 0;
        int high = matrix.length - 1; // row
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (matrix[mid][0] <= target && target <= matrix[mid][matrix[0].length - 1]) {
                return mid;
            } else if (matrix[mid][0] < target) {
                low = mid + 1;
            } else if (matrix[mid][0] > target) {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static int binarySearchOverRow(int rowIndex, int[][] matrix, int target) {
        int low = 0;
        int high = matrix[rowIndex].length - 1; // col
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (matrix[rowIndex][mid] == target) {
                return 1;
            } else if (matrix[rowIndex][mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return 0;
    }
}

//only applicable if the matrix is sorted in row wise manner
