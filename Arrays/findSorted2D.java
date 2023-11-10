package Arrays;

import java.util.Scanner;

public class findSorted2D {
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
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the element to search here :");
        int target = input.nextInt();
        boolean result = find2D(array, rows, cols, target);
        System.out.println(result);
    }

    public static boolean find2D(int[][] array, int rows, int cols, int target) {
        int r = array.length-1;
        int c = 0;
        while (r>= 0 && c < array[0].length){
            if (array[r][c] == target){
                return true;
            } else if (target > array[r][c]) {
                c++;
            }
            else{
                r--;
            }
        }
        return false;
    }
}
