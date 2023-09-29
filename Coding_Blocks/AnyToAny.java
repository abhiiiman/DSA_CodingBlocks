package Coding_Blocks;

import java.util.Scanner;

public class AnyToAny {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long octalNumber = input.nextLong();
        long decimalValue = octalToDecimal(octalNumber);
        long binaryValue = decimalToBinary(decimalValue);
        System.out.println(decimalValue);
        System.out.println(binaryValue);
    }
    public static long octalToDecimal(long octal){
        long decimal = 0;
        long power = 0;
        while (octal != 0){
            decimal += (long) (octal%10 * Math.pow(8, power));
            octal /= 10;
            power++;
        }
        return decimal;
    }
    public static long decimalToBinary(long decimal){
        long binary = 0;
        long digitPlace = 1;
        while (decimal != 0){
            binary += (long) (decimal%2 * digitPlace);
            decimal /= 2;
            digitPlace *= 10;
        }
        return binary;
    }
}
