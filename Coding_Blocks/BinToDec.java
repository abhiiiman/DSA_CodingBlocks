package Coding_Blocks;
import java.util.Scanner;
import java.lang.Math;

public class BinToDec {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long number = input.nextLong(); //101010 = 42
        int sum = 0;
        int power = 0;
        while (number > 0){
            long digit = number%10;
            sum += (int) (digit * ((int) Math.pow(2,power)));
            power++;
            number /= 10;
        }
        System.out.println(sum);
    }
}
