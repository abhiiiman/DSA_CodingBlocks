package Coding_Blocks;

import java.util.Scanner;

public class MakeNum2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();
        long finalNum = 0;
        while (count > 0){
            int number = input.nextInt();
            finalNum = finalNum * 10 + number;
            count--;
        }
        System.out.print(finalNum);
    }
}
