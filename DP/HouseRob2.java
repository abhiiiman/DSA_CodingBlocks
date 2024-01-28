package DP;

import java.util.Arrays;

public class HouseRob2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 1};

        int ans = getMaxRobcylic(array);
        System.out.println(ans);
    }

    private static int getMaxRobcylic(int[] array) {
        int[] dp1 = new int[array.length];
        int[] dp2 = new int[array.length];
        if (array.length == 1) {
            return array[0];
        }
        if (array.length == 2) {
            return Math.max(array[0], array[1]);
        }
//        case-1
        dp1[0] = array[0];
        dp1[1] = Math.max(array[0], array[1]);
        for (int i = 2; i <= array.length - 2; i++) {
            dp1[i] = Math.max(dp1[i - 2] + array[i], dp1[i - 1]);
        }
        System.out.println(Arrays.toString(dp1));
        int skipLastHouse = dp1[dp1.length - 2];
//        case-2
        dp2[1] = array[1];
        dp2[2] = Math.max(array[1], array[2]);
        for (int i = 3; i <= array.length - 1; i++) {
            dp2[i] = Math.max(dp2[i - 2] + array[i], dp2[i - 1]);
        }
        System.out.println(Arrays.toString(dp2));
        int includeLastHouse = dp2[dp2.length - 1];
        return Math.max(skipLastHouse, includeLastHouse);
    }
}
