package Arrays;

import java.util.Scanner;

public class minSubArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = input.nextInt();
        }
        int p = input.nextInt();
        int result = makeArrayDivisible(nums, p);
        System.out.println(result);
    }

    public static int makeArrayDivisible(int[] nums, int p) {
        int sum = 0;
        for (int value : nums){
            sum += value;
        }
        System.out.println(sum);
        int rem = sum % p;
        System.out.println(rem);
        if (rem == 0){
            return 0;
        } else if (sum < p) {
//            return sum - p;
            return -1;
        } else{
            int count = 1;
            int subArraySum = nums[0];
            for (int i = 1; i < nums.length; i++){
                if (subArraySum <= rem){
                    subArraySum += nums[i];
                    count++;
                }
                else{
                    subArraySum = nums[i];
                    count = 1;
                }
            }
            return count;
        }
    }
}
// TODO
