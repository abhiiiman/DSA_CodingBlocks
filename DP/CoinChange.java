package DP;

import java.util.Scanner;

public class CoinChange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int amount = input.nextInt();
        int nCoins = input.nextInt();
        int[] coinArray = new int[nCoins];
        for (int i = 0; i < coinArray.length; i++) {
            coinArray[i] = input.nextInt();
        }
        int ans = countWays(coinArray, amount);
        System.out.println(ans);
    }

    private static int countWays(int[] coinArray, int amount) {
        int[] dp = new int[amount + 1];
        dp[0] = 1;
        for (int coin : coinArray) {
            for (int j = coin; j < dp.length; j++) {
                dp[j] += dp[j - coin];
            }
        }
        return dp[dp.length - 1];
    }
}
