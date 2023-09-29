package Patterns;

import java.util.Scanner;

public class Pattern_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int row = 1;
        int totalStar = n;
        int totalSpaces = 0; //row-1 i.e 1-1 = 0.
//        step-1:outer-loop.
        while (row <= n){
//            Step-2:star
            int countStar = 0;
            int countSpace = 0;
//            for space.
            while (countSpace < totalSpaces){
                System.out.print("  ");
                countSpace++;
            }
//            for star.
            while (countStar < totalStar){
                System.out.print("* ");
                countStar++;
            }
            row++;
            totalStar--;
            totalSpaces++;
            System.out.println();
        }
    }
}