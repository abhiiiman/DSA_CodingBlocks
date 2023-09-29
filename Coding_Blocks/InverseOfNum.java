package Coding_Blocks;
import java.util.Scanner;
import java.lang.Math;

public class InverseOfNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long num = input.nextLong();
        long place = 1;
        long answer = 0;
        while (num != 0){
            long rem = num%10;
            answer = (long) (answer + place * (Math.pow(10, rem-1)));
            place++;
            num /= 10;
        }
        System.out.println(answer);
    }
}
