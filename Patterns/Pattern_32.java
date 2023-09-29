package Patterns;

import java.util.Scanner;

public class Pattern_32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int row = 1;
        int num = 1;
        int totalStar = 1;
        while (row <= 2*n-1){
            int countStar = 0;
            while (countStar < totalStar){
                if (countStar % 2 == 0) {
                    System.out.print(num + " "); //even pos
                }
                else{
                    System.out.print("* "); // odd pos
                }
                countStar++;
            }
            if (row < n){
                totalStar += 2;
                num++;
            }
            else{
                totalStar -= 2;
                num--;
            }
            row++;
            System.out.println();
        }
    }
}