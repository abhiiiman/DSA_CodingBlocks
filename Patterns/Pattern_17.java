package Patterns;
import java.util.Scanner;

public class Pattern_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int row = 1;
        int midValue = (n+1)/2;
        int totalStar = midValue-1;
        int totalSpaces = 1;
        while (row <= n){
            int countStar = 0;
            int countSpace = 0;
            while (countStar < totalStar){
                System.out.print("*  ");
                countStar++;
            }
            while (countSpace < totalSpaces){
                System.out.print("   ");
                countSpace++;
            }
            countStar = 0;
            while (countStar < totalStar){
                System.out.print("*  ");
                countStar++;
            }
            row++;
            if (row <= midValue){
                totalStar--;
                totalSpaces += 2;
            }
            else{
                totalStar++;
                totalSpaces -= 2;
            }
            System.out.println();
        }
    }
}