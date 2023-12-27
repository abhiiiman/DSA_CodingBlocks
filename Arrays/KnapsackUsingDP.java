package Arrays;

public class KnapsackUsingDP {

    public static int knapsack(int[] weights, int[] values, int capacity) {
        int n = weights.length;

        // Initialize a 2D array to store the results of subproblems
        int[][] dp = new int[n + 1][capacity + 1];

        // Build the DP table bottom-up
        for (int i = 1; i <= n; i++) {
            for (int w = 0; w <= capacity; w++) {
                // If the current item can be included in the knapsack
                if (weights[i - 1] <= w) {
                    dp[i][w] = Math.max(values[i - 1] + dp[i - 1][w - weights[i - 1]], dp[i - 1][w]);
                } else {
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }

        // The result is stored at the bottom-right corner of the table
        return dp[n][capacity];
    }

    public static void main(String[] args) {
        int[] weights = {1, 2, 3, 4, 5};
        int[] values = {10, 20, 30, 40, 50};
        int capacity = 7;

        int result = knapsack(weights, values, capacity);
        System.out.println("Maximum value: " + result);
    }
}
