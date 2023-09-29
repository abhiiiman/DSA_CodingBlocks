package Coding_Blocks;

import java.util.Scanner;

public class MakeNumber2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();
        int finalNum = 0;
        while (count > 0){
            int number = input.nextInt();
            finalNum = finalNum * 10 + number;
            count--;
        }
        while (finalNum > 0){
            int digit = finalNum%10;
            finalNum /= 10;
            System.out.print(digit);
        }
    }
}
