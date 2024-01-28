package DP;

import java.util.Scanner;

public class ClimbStairsMinMoves {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int t = input.nextInt();
        for (int i = 1; i <= t; i++) {
            int n = input.nextInt();
            int minMoves = getMinMoves(n);
            System.out.println(minMoves);
        }
    }

    public static int getMinMoves(int n) {
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        Integer[] dp = new Integer[n + 1];
        dp[n] = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (array[i] > 0) {
                int min = Integer.MAX_VALUE;
                for (int j = 1; j <= array[i] && i + j < dp.length; j++) {
                    if (dp[i + j] != null) {
                        min = Math.min(min, dp[i + j]);
                    }
                }
                if (min != Integer.MAX_VALUE) {
                    dp[i] = min + 1;
                }
            }
        }
        return dp[0];
    }
}
