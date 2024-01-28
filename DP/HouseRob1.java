package DP;

import java.util.Arrays;
import java.util.Scanner;

public class HouseRob1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = input.nextInt();
        }
//        int[] nums = {2,1,1,2};
        int ans = getMaxRob(nums);
        System.out.println(ans);
    }

    private static int getMaxRob(int[] nums) {
        int[] dp = new int[nums.length];
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        } else {
            dp[0] = nums[0];
            dp[1] = Math.max(nums[0], nums[1]);
            for (int i = 2; i < nums.length; i++) {
                dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
            }
        }
        System.out.println(Arrays.toString(dp));
        return dp[dp.length - 1];
    }
}
