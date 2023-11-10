package Arrays;

import java.util.Scanner;

public class twoDArray {

    public static void main(String args[]) {

        System.out.print("Enter 2D array size : ");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();

        System.out.println("Enter array elements (Row, Column): ");

        int twoD[][] = new int[rows][columns];


        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                twoD[i][j] = sc.nextInt();
            }
        }
        // remember this shit :)
        // rows = twoD.length;
        // cols = twoD[0].length;

        System.out.print("\nData you entered : \n");
        for (int[] x : twoD) {
            for (int y : x) {
                System.out.print(y + "        ");
            }
            System.out.println();
        }
        // pattern
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.println(twoD[i][0]);
            }
        }

    }

}