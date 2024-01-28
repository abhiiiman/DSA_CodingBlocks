package DP;

import java.util.Scanner;

public class ClimbStairsVar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        int[] dp = new int[n + 1];
        dp[n] = 1;
        for (int i = n - 1; i >= 0; i--) { //dp
            for (int j = 1; j <= array[i] && i + j < dp.length; j++) { // array
                dp[i] += dp[i + j];
            }
        }
        System.out.println(dp[0]);
    }
}
