package DP;

import java.util.Arrays;
import java.util.Scanner;

public class FibDP {
    static int funcCallCounterDP = 0;
    static int funcCallCounterRec = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arrayDP = new int[n + 1];
        int ansDP = fibDP(n, arrayDP);
        int ansRec = fibRec(n);
        System.out.println(ansDP);
//        System.out.println(ansRec);
        System.out.println("Function Call Counter for DP -> " + funcCallCounterDP);
        System.out.println("Function Call Counter for Rec -> " + funcCallCounterRec);
    }

    private static int fibDP(int n, int[] array) {
        if (n == 0 || n == 1) {
            return n;
        }
        if (array[n] != 0) {
            return array[n];
        }
//        System.out.println("DP Function Call for " + n);
        funcCallCounterDP++;
        int fib1 = fibDP(n - 1, array);
        int fib2 = fibDP(n - 2, array);
        int fibAns = fib1 + fib2;
        array[n] = fibAns;
//        System.out.println(Arrays.toString(array));
        return fibAns;
    }
    private static int fibRec(int n){
        if (n == 0 || n == 1) {
            return n;
        }
//        System.out.println("Recursive Function Call for " + n);
        funcCallCounterRec++;
        int fib1 = fibRec(n - 1);
        int fib2 = fibRec(n - 2);
        return fib1 + fib2;
    }
}
