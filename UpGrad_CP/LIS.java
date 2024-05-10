package UpGrad_CP;

import java.util.*;

public class LIS {
    static int[][] dp;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = input.nextInt();
        }
//        filling the default dp array here
        dp = new int[n + 1][n + 1];
        for (int[] array1D : dp) {
            Arrays.fill(array1D, -1);
        }
        int ans = lengthOfLIS(nums);
        System.out.println(ans);
    }

    private static int lengthOfLIS(int[] nums) {
        int n = nums.length;
        // init the dp here.
        dp = new int[n + 1][n + 1];
        for (int[] array1D : dp) {
            Arrays.fill(array1D, -1);
        }
        return solve(nums, 0, -1);
    }

    private static int solve(int[] nums, int curr, int prev) {
        if (prev != -1 && dp[curr][prev] != -1) return dp[curr][prev];
        if (curr >= nums.length) return 0;
        int take = 0, skip;
        if (prev == -1 || nums[curr] > nums[prev]) {
            take = 1 + solve(nums, curr + 1, curr);
        }
        skip = solve(nums, curr + 1, prev);
        if (prev != -1) {
            dp[curr][prev] = Math.max(take, skip);
        }
        return Math.max(take, skip);
    }
}