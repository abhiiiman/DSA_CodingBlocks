package Arrays;

import java.util.HashMap;
import java.util.Scanner;

public class divisibleSubArrays {
    public static void main(String[] args) {
        // input format
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for (int i = 0; i < t; i++) {
            int k = input.nextInt();
            int[] array = new int[k];
            for (int j = 0; j < k; j++) {
                array[i] = input.nextInt();
            }
            // main code
            int countResult = countSubArrays(array, k);
            int result = optimal(array, k);
            System.out.println(result);
        }
    }

    public static int countSubArrays(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int sum = 0;
        map.put(0, 1);
        for (int num : nums) {
            sum += num;
            int rem = sum % k;
            if (rem < 0)
                rem += k;
            if (map.containsKey(rem)) {
                count += map.get(rem);
                map.put(rem, map.get(rem) + 1);
            } else {
                map.put(rem, 1);
            }
        }
        return count;
    }

    public static int optimal(int[] nums, int k) {
        int[] count = new int[k];
        count[0] = 1;
        int prefix = 0, res = 0;
        for (int a : nums) {
            prefix = (prefix + a % k + k) % k;
            res += count[prefix]++;
        }
        return res;
    }
}
