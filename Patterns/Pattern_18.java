package Patterns;
import java.util.Scanner;

public class Pattern_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int row = 1;
        int totalStar = 1;
        int midValue = (n+1)/2;
        int totalSpaces = midValue-1;
        while (row <= n){
            int countStar = 0;
            int countSpace = 0;
            while (countSpace < totalSpaces){
                System.out.print("   ");
                countSpace++;
            }
            while (countStar < totalStar){
                System.out.print("*  ");
                countStar++;
            }
            row++;
            if (row <= midValue){
                totalStar += 2;
                totalSpaces--;
            }
            else{
                totalStar -= 2;
                totalSpaces++;
            }
            System.out.println();
        }
    }
}