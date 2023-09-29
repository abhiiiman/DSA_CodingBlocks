package Patterns;

import java.util.Scanner;

public class Pattern_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int row = 1;
        int totalStar = 1;
//        step-1:outer-loop.
        while (row <= n){
//            Step-2:star
            int countStar = 0;
            while (countStar < totalStar){
                System.out.print("* ");
                countStar++;
            }
            row++;
            totalStar++;
            System.out.println();
        }
    }
}
