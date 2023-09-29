package Patterns;

import java.util.Scanner;

public class Pattern_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int row = 1;
        int totalStar = n;
        while (row <= n){
            int countStar = 0;
            while (countStar < totalStar){
                if (row == 1 || row == n || countStar == 0 || countStar == n-1) {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
                countStar++;
            }
            row++;
            System.out.println();
        }
    }
}
