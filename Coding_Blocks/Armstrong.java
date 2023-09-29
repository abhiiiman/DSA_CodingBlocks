package Coding_Blocks;
import java.util.Scanner;
import java.lang.Math;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int countValue = checkCount(number);
        int powerValue = checkPowerSum(number, countValue);
        boolean checkValue = checkArmstrong(powerValue, number);
        System.out.println(checkValue);
    }

//    function to count the digits.
    static int checkCount(int number){
        int countDigit = 0;
        while (number > 0){
            number /= 10;
            countDigit++;
        }
        return countDigit;
    }

//    function to sum the power of each digit.
    static int checkPowerSum(int number, int count){
        int powerSum = 0;
        while (number > 0){
            int temp = number%10;
            powerSum += (int) Math.pow(temp,count);
            number /= 10;
        }
        return powerSum;
    }

//    function to check the armstrong number.
    static boolean checkArmstrong(int powerSum, int number){
        return (powerSum == number);
    }
}
