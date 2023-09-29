package Patterns;

import java.util.Scanner;

public class Pattern_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int row = 1;
        int num = n;
        int totalStar = n;
        while (row <= n){
            int countStar = 0;
            while (countStar < totalStar){
                if (row + countStar == n) {
                    System.out.print("*  ");
                }
                else{
                    System.out.print(num + "   ");
                }
                countStar++;
                num--;
            }
            row++;
            num = n;
            System.out.println();
        }
    }
}
