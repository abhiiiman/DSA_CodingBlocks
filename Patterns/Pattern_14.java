package Patterns;
import java.util.Scanner;

public class Pattern_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int row = 1;
        int totalStar = 1;
        int totalSpaces = n-1;
        while (row <= 2*n-1){
            if (row < n){
                int countStar = 0;
                int countSpace = 0;
                while (countSpace < totalSpaces){
                    System.out.print("  "); //2-spaces.
                    countSpace++;
                }
                while (countStar < totalStar){
                    System.out.print("* ");
                    countStar++;
                }
                row++;
                totalStar++;
                totalSpaces--;
                System.out.println();
            }
            else{
                int countStar = 0;
                int countSpace = 0;
                while (countSpace < totalSpaces){
                    System.out.print("  "); //2-spaces.
                    countSpace++;
                }
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
}