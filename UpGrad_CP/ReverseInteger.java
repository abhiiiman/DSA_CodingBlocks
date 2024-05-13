package UpGrad_CP;

import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int result = reverse(n);
        System.out.println(result);
    }

    private static int reverse(int n) {
        int rev = 0;
        while (n != 0) {
            rev = rev * 10 + n % 10; // extract the last digit.
            n /= 10; // remove the extracted digit from the last.
        }
        return rev;
    }
}
