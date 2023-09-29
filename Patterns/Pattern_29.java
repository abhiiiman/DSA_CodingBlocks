package Patterns;

import java.util.Scanner;

public class Pattern_29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int row = 1;
        int num = 1;
        int totalStar = 1;
        int totalSpaces = n-1;
        while (row <= n){
            int countStar = 0;
            int countSpace = 0;
            while (countSpace < totalSpaces){
                System.out.print("  ");
                countSpace++;
            }
            while (countStar < totalStar){
                if (countStar == 0 || countStar == totalStar-1) {
                    System.out.print(num + " ");
                }
                else{
                    System.out.print("0 ");
                }
                countStar++;
            }
            row++;
            num++;
            totalStar += 2;
            totalSpaces--;
            System.out.println();
        }
    }
}