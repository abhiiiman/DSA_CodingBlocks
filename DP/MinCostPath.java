package DP;

import java.util.Scanner;

public class MinCostPath {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row = input.nextInt();
        int col = input.nextInt();
        int[][] nums = new int[row][col];
        for (int r = 0; r < nums.length; r++) {
            for (int c = 0; c < nums[0].length; c++) {
                nums[r][c] = input.nextInt();
            }
        }
//        print2DArray(nums);
        int minCost = getMinCost(nums);
        System.out.println(minCost);
    }

    private static void print2DArray(int[][] array2D) {
        for (int[] rows : array2D) {
            for (int cols : rows) {
                System.out.print(cols + " ");
            }
            System.out.println();
        }
    }

    private static int getMinCost(int[][] nums) {
        int[][] dp = new int[nums.length][nums[0].length];
        dp[dp.length - 1][dp[0].length - 1] = nums[nums.length - 1][nums[0].length - 1];
        // filling the last col first here.
        for (int row = nums.length - 2; row >= 0; row--) {
            dp[row][nums[0].length - 1] = dp[row + 1][nums[0].length - 1] + nums[row][nums[0].length - 1];
        }
//        filling the last row first here.
        for (int col = nums[0].length - 2; col >= 0; col--) {
            dp[nums.length - 1][col] = dp[nums.length - 1][col + 1] + nums[nums.length - 1][col];
        }
//        filling the rest with dp array here.
        for (int row = dp.length - 1; row >= 0; row--) {
            for (int col = dp[0].length - 1; col >= 0; col--) {
                if (dp[row][col] == 0) {
                    dp[row][col] = nums[row][col] + Math.min(dp[row][col + 1], dp[row + 1][col]);
                }
            }
        }
//        print2DArray(dp);
        return dp[0][0];
    }
}
