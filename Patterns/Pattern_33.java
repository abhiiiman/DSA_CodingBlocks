 package Patterns;

import java.util.Scanner;

public class Pattern_33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
//        int num = 10;
        int row = 1;
        int totalStar = 1;
        int totalSpaces = n-1;
        while (row <= n){
            int num = n-(row-1);
            int countStar = 0;
            int countSpace = 0;
            while (countSpace < totalSpaces){
                System.out.print("\t");
                countSpace++;
            }
            while (countStar < totalStar){
                if (num == 10) {
                    System.out.printf("%d\t", 0);
                }
                else{
                    System.out.printf("%d\t", num);
                }
                if (countStar < totalStar/2) {
                    num++;
                }
                else{
                    num--;
                }
                countStar++;
            }
            row++;
            totalStar += 2;
            totalSpaces--;
            System.out.println();
        }
    }
}