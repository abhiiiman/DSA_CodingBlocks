package Patterns;
import java.util.Scanner;

public class Pattern_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int row = 1;
        int totalStar = 1;
        while (row <= 2*n-1){
            if (row < n){
                int countStar = 0;
                while (countStar < totalStar){
                    System.out.print("* ");
                    countStar++;
                }
                row++;
                totalStar++;
                System.out.println();
            }
            else{
                int countStar = 0;
                while (countStar < totalStar){
                    System.out.print("* ");
                    countStar++;
                }
                row++;
                totalStar--;
                System.out.println();
            }
        }
    }
}