package Patterns;

import java.util.Scanner;

//Conventional Code.

public class Pattern_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int row = 1;
        int totalStar = n;
        while (row <= n){
            int countStar = 0;
            while (countStar < totalStar){
                System.out.print("* ");
                countStar++;
            }
            row++;
            System.out.println();
        }
    }
}

//Aliter Code.

//package Patterns;
//import java.util.Scanner;
//
//public class Pattern_1 {
//    public static void main(String[] args) {
//        Scanner input = new Scanner((System.in));
//        int n = input.nextInt();
//        int i = 0;
//        while (i < n){
//            int j = 0;
//            while (j < n){
//                System.out.print("* ");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }
//    }
//}
