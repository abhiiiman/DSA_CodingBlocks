package Coding_Blocks;
import java.util.Scanner;

public class ReplaceAll {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int divisor = 1;
        while (number / divisor >= 10) {
            divisor *= 10;
        }

        while (divisor > 0) {
            int digit = (number / divisor) % 10;
            if (digit == 0){
                digit = 5;
            }
            System.out.print(digit);
            divisor /= 10;
        }
    }
}
