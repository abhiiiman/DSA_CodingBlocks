package Coding_Blocks;

import java.util.Scanner;
import java.lang.Math;

public class RotateNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = input.nextInt(); // 12345
        System.out.print("Rotation : ");
        int rot = input.nextInt(); //3
        int backup = num;
        int nod = 0;
        while (num > 0){
            num /= 10;
            nod++;
        }
        num = backup;
        rot %= nod;
        int divisor = (int)Math.pow(10, rot);
        int p_right = num%divisor;
        int mult = (int)Math.pow(10, nod - rot);
        int p_left = num/divisor;
        num = p_right*mult + p_left;
        System.out.println(num);
    }
}

// this solution is not using loops and directly rotating the numbers. (optimal)