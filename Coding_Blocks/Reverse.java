package Coding_Blocks;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int reverseAnswer = 0;
        while (num > 0){
            int digit = num%10;
            reverseAnswer = reverseAnswer*10 + digit;
            num /= 10;
            System.out.println(digit);
        }
        System.out.println(reverseAnswer + 23);
    }
}
