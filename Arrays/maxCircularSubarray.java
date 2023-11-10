package Arrays;

import java.util.Scanner;

public class maxCircularSubarray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for (int i = 0; i < t; i++) {
            int size = input.nextInt();
            int[] nums = new int[size];
            for (int j = 0; j < size; j++) {
                nums[j] = input.nextInt();
            }
            int result = circularKadane(nums);
            System.out.println(result);
        }
    }

    public static int kadane(int[] array) {
        int csum = array[0];
        int osum = array[0];
        for (int i = 1; i < array.length; i++) {
            if (csum >= 0){
                csum += array[i];
            }
            else{
                csum = array[i];
            }
            osum = Math.max(csum, osum);
        }
        return osum;
    }

    public static int circularKadane(int[] array) {
        int totalSum = 0;
        int straightMaxSum = kadane(array);
        // edge case - 1
        if (array.length == 0) return 0;
        // storing the total sum and inverting the array here.
        for (int i = 0; i < array.length; i++) {
            totalSum += array[i];
            array[i] *= -1;
        }
        int invertedMaxSum = kadane(array);
        // edge case - 2
        if (totalSum + invertedMaxSum == 0) return straightMaxSum;
        // subtracting the invertedmaxsum result from the totalsum to get the circular max.
        return Math.max(totalSum + invertedMaxSum, straightMaxSum); // i.e. totalsum - (-invertedmaxsum)
    }
}
