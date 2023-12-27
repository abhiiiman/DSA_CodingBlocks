package Arrays;

import java.util.Scanner;

public class subarrayDivByKArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = input.nextInt();
        }
        int k = input.nextInt();
        int res = subarraysDivByK(nums, k);
        System.out.println(res);
    }
    public static int subarraysDivByK(int[] nums, int k) {
        int n = nums.length;
        int res = 0;
        int cummSum = 0;
        int[] map = new int[k];
        map[0] = 1;

        for (int num : nums) {
            cummSum += num % k;

            if (cummSum < 0) {
                cummSum = (cummSum + k) % k;
            } else {
                cummSum = cummSum % k;
            }

            res += map[cummSum]++;
        }

        return res;
    }
}
