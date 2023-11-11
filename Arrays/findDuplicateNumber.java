package Arrays;

import java.util.Scanner;

public class findDuplicateNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = input.nextInt();
        }
//        approach - 1 : driver code
        int duplicate = HareTortoise(nums);
        System.out.println(duplicate);
//        approach - 2 : driver code
        int dupe = findDupNum(nums);
        System.out.println(dupe);
    }
//approach 1 : 4ms, 57MB
    public static int HareTortoise(int[] nums) {
//        init values here
        int slow = nums[0];
        int fast = nums[0];

//        moving the pointers
        slow = nums[slow];
        fast = nums[nums[fast]];

//        loop to detect the cycle here
        while (slow != fast){
//            moving the pointers again
            slow = nums[slow];
            fast = nums[nums[fast]];
        }

//        when they meet at the same point
        slow = nums[0];
        while (slow != fast){
//            moving the pointers again by one step only
            slow = nums[slow];
            fast = nums[fast];
        }

//        return either slow or fast, same
        return fast;
    }
//    approach 2 : 1ms, 56MB
    public static int findDupNum(int[] nums) {
        boolean[] seen = new boolean[nums.length];
        for (int value: nums) {
            if (seen[value]){
                return value;
            }
            else{
                seen[value] = true;
            }
        }
//        to handle all unique elements
        return -1;
    }
}
