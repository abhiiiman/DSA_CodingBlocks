package UpGrad_CP;

import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        printPascalTriangle(num);
    }

    private static void printPascalTriangle(int num) {
        // using the formula : k = ( k * (n - i) / i ) Binomial Expansion.
        for (int line = 1; line <= num; line++) {
            for (int j = 1; j <= num - line; j++) { // loop to print left spaces here.
                System.out.print(" ");
            }
            // loop for the formula.
            int k = 1;
            for (int i = 1; i <= line; i++) {
                System.out.print(k + " ");
                k = k * (line - i) / i;
            }
            System.out.println();
        }
    }
}
