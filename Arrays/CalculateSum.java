package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class CalculateSum {

    // method for operation-0 here
    public static int[] operation0(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = 2 * array[i];
        }
        return array;
    }

    // method for operation-1 here
    public static int[] operation1(int[] array) {
        int first = 0;
        int last = array.length - 1;
        int[] array1 = new int[array.length];
        array1[0] = array[first] + array[last];
        for (int i = 1; i < array.length; i++) {
            array1[i] = array[i] + array[i - 1];
        }
        return array1;
    }

    public static void main(String[] args) {
        // input code
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = input.nextInt();
        }
        int q = input.nextInt();
        for (int i = 0; i < q; i++) {
            int o = input.nextInt();
            if (o == 0) {
                nums = operation0(nums);
            } else {
                nums = operation1(nums);
            }
        }
        // main
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        int result = sum % ((int) (Math.pow(10, 9)) + 7);
        System.out.println(result);
    }
}
