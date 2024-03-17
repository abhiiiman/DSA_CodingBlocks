package UpGrad_CP;

import java.util.Scanner;

public class firstNonZeroFactorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int ans = findNumber(num);
        System.out.println(ans);
    }

    private static int findNumber(int num) {
        int factValue = Factorial(num); // 5! = 120
        // find the last non-zero digit.
        while (factValue % 10 == 0) { // 120/10 = 12 and r = 0 so, true. | 12/10 = 1.2 i.e r = 2 =! 0 so, false.
            factValue /= 10; // 120/10 = 12
        }
        return factValue % 10; // 12%10 = 2 (first non-zero number found)
    }

    // method to find the factorial
    private static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    private static int Factorial(int n) {
        if (n >= 1) {
            return n * Factorial(n - 1);
        }
        return 1;
    }
}
