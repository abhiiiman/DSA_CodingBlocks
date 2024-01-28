package DP;

import java.util.Arrays;

public class HouseRob2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 1};
//        create 2 arrays here for 2 cycle cases
        int[] skipLastHouse = new int[array.length - 1];
        int[] skipFirstHouse = new int[array.length - 1];
//        copying the elements from the main array here
        for (int i = 0; i < array.length - 1; i++) {
            skipLastHouse[i] = array[i];
            skipFirstHouse[i] = array[i + 1];
        }
//        get the loot from both the case
        int lootSkippingLast = robHelper(skipLastHouse);
        int lootSkippingFirst = robHelper(skipFirstHouse);
        int maxLoot = Math.max(lootSkippingLast, lootSkippingFirst);
        System.out.println(maxLoot);
    }

    private static int robHelper(int[] array) {
        if (array.length <= 1) {
            return array[0];
        }
        if (array.length == 2) {
            return Math.max(array[0], array[1]);
        }
        int[] dp = new int[array.length];
        dp[0] = array[0];
        dp[1] = Math.max(array[0], array[1]);
        for (int i = 2; i < dp.length; i++) {
            dp[i] = Math.max(dp[i - 2] + array[i], dp[i - 1]);
        }
        System.out.println(Arrays.toString(dp));
        return dp[dp.length - 1];
    }
}
