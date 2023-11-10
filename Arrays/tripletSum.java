package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class tripletSum {
    public static void main(String[] args) {
        // input format
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        int target = input.nextInt();
        Arrays.sort(array);
        // main
        for (int i = 0; i < array.length; i++) {
            int r = i;
            int left = i+1;
            int right = array.length-1;
            while (left < right){
                int targetSum = array[left] + array[right] + array[r];
                if (targetSum == target){
                    System.out.println(array[r] + ", " + array[left] + " and " + array[right]);
                    left++;
                    right--;
                }
                else if (targetSum > target){
                    right--;
                }
                else{
                    left++;
                }
            }
        }
    }
}
