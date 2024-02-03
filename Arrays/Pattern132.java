package Arrays;

import java.util.Scanner;
import java.util.Stack;

public class Pattern132 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }
        boolean foundPattern = find_132_Pattern_Better(array);
        System.out.println(foundPattern);
    }

    // Better : O(N^2) - 101/105 test cases passed.
    private static boolean find_132_Pattern_Better(int[] nums) {
        int n = nums.length;
        int smallestNum_i = nums[0];
        for (int j = 0; j < n - 1; j++) {
            for (int k = j + 1; k < n; k++) {
                if (smallestNum_i < nums[k] && nums[k] < nums[j]) return true;
                smallestNum_i = Math.min(smallestNum_i, nums[j]);
            }
        }
        return false;
    }

    // Optimal : O(N) - 105/105 test cases passed.
    private static boolean find_132_Pattern_Optimal(int[] array) {
        int n = array.length;
        Stack<Integer> stack = new Stack<>();
        int k = Integer.MIN_VALUE;
        for (int i = n - 1; i >= 0; i--) {
            if (array[i] < k) return true; // found the smallest element so return.
            while (!stack.isEmpty() && stack.peek() < array[i]) { // stack will.
                k = stack.peek(); // second largest.
                stack.pop();
            }
            stack.push(array[i]); // storing the largest here.
        }
        return false;
    }

    // brute : O(N^3) - 94/105 test cases passed.
    private static boolean find_132_Pattern_Brute(int[] array) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (array[i] < array[k] && array[k] < array[j]) return true;
                }
            }
        }
        return false;
    }
}
