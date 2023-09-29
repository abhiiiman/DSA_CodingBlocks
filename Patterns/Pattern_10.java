package Patterns;

import java.util.Scanner;

public class Pattern_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int row = 1;
        int totalStar = 2*n-1; //9
        int totalSpaces = 0;
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
                System.out.print("* "); //1spaces.
                countStar++;
            }
            row++;
            totalStar -= 2;
            totalSpaces++;
            System.out.println();
        }
    }
}