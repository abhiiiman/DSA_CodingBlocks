package Patterns;

import java.util.Scanner;

public class Pattern_28 {
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
                System.out.print("\t");
                countSpace++;
            }
            while (countStar < totalStar){
                System.out.print(num + "\t");
                if (countStar < totalStar/2) {
                    num++;
                }
                else{
                    num--;
                }
                countStar++;
            }
            row++;
            num = row;
            totalStar += 2;
            totalSpaces--;
            System.out.println();
        }
    }
}