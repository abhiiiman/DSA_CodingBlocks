package Coding_Blocks;
import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int dividend = a;
        int divisor = b;

//        if (a < b){
//            divisor = a;
//            dividend = b;
//        }
//        else{
//            divisor = b;
//            dividend = a;
//        } no need.

//        while (dividend % divisor != 0){
//            int r = dividend % divisor;
//            dividend = divisor;
//            divisor = r;
//        }
//        System.out.println(divisor);
//        (a*b = lcm * hcf)

        while (divisor > 0){
            int r = dividend % divisor;
            dividend = divisor;
            divisor = r;
        }
        System.out.println(dividend);
    }
}
