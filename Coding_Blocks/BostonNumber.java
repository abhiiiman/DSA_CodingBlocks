package Coding_Blocks;
import java.util.Scanner;

public class BostonNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();

        int i = 2;
        int factorSum = 0;

        while (i <= n1)
        {
            // to get the sum of primes.
            if (n1 % i != 0){
                i++;
            }
            else{
                n1 = n1/i;
                factorSum += i;
            }
        }
//        System.out.println("factorsum " + factorSum);
        int digitSum = 0;
        while (n1 > 0){
            digitSum += n1%10;
            System.out.println(digitSum);
            n1 /= 10;
            System.out.println(n1);
        }

        System.out.println("digitsum " + digitSum);

        // checking for the boston number.
        if (factorSum == digitSum){
            System.out.println("boston : 1");
        }
        else{
            System.out.println("boston : 0");
        }
    }
}
