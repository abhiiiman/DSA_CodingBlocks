package Patterns;

import java.util.Scanner;

public class Pattern_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int row = 1;
        int totalStars = n;
        int totalSpaces = -1;
        while (row <= n){
            int countStars = 0;
            int countSpaces = 0;
            while (countStars < totalStars){
                System.out.print("*  ");
                countStars++;
            }
            while (countSpaces < totalSpaces){
                System.out.print("   ");
                countSpaces++;
            }
            countStars = 0;
            if (row == 1){
                countStars = 1;
            }
            while (countStars < totalStars){
                System.out.print("*  ");
                countStars++;
            }
            row++;
            totalStars--;
            totalSpaces += 2;
            System.out.println();
        }
    }
}
