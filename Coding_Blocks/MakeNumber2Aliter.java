package Coding_Blocks;

import java.util.Scanner;

public class MakeNumber2Aliter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int count = 1;
        int answer = 0;
        int multiply = 1;

        while (count <= n){
            int numInput = input.nextInt();
            answer= answer + numInput * multiply;
            multiply *= 10;
            count += 1;
        }

        System.out.println(answer);
    }
}
