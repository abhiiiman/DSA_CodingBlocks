package Patterns;

import java.util.Scanner;

public class Pattern_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int row = 1;
        int totalStar = 1;
        int totalSpaces = n-1;
//        step-1:outer-loop.
        while (row <= n){
//            Step-2:star
            int countStar = 0;
            int countSpace = 0;
//            for space.
            while (countSpace < totalSpaces){
                System.out.print("  "); //2-spaces.
                countSpace++;
            }
//            for star.
            while (countStar < totalStar){
                if (countStar % 2 == 0){
                    System.out.print("* ");
                }
                else{
                    System.out.print("! ");
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