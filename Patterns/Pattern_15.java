package Patterns;
import java.util.Scanner;

public class Pattern_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int row = 1;
        int totalStar = n;
        int totalSpaces = 0;
        while (row <= 2*n-1){
            if (row < n){
                int countStar = 0;
                int countSpace = 0;
                while (countSpace < totalSpaces){
                    System.out.print("  ");
                    countSpace++;
                }
                while (countStar < totalStar){
                    System.out.print("* ");
                    countStar++;
                }
                row++;
                totalStar--;
                totalSpaces += 2;
                System.out.println();
            }
            else{
                int countStar = 0;
                int countSpace = 0;
                while (countSpace < totalSpaces){
                    System.out.print("  ");
                    countSpace++;
                }
                while (countStar < totalStar){
                    System.out.print("* ");
                    countStar++;
                }
                row++;
                totalStar++;
                totalSpaces -= 2;
                System.out.println();
            }
        }
    }
}