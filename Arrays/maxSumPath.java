package Arrays;

import java.util.Scanner;

public class maxSumPath {
    public static void main(String[] args) {
        // input format
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for (int i = 0; i < t; i++) {
            int l1 = input.nextInt();
            int l2 = input.nextInt();
            int[] array1 = new int[l1];
            int[] array2 = new int[l2];
            for (int j = 0; j < l1; j++) {
                array1[j] = input.nextInt();
            }
            for (int k = 0; k < l2; k++) {
                array2[k] = input.nextInt();
            }
            // main code
            int result = maxSum(array1, array2);
            System.out.println(result);
        }
    }

    public static int maxSum(int[] array1, int[] array2) {
        int l1 = array1.length;
        int l2 = array2.length;
        int sum1 = 0, sum2 = 0, i = 0, j = 0, result = 0;
        while (i < l1 && j < l2) {
            if (array1[i] < array2[j]) {
                sum1 += array1[i];
                i++;
            } else if (array2[j] < array1[i]) {
                sum2 += array2[j];
                j++;
            } else {
                result += Math.max(sum1, sum2);
                sum1 = 0;
                sum2 = 0;
                while (i < l1 && j < l2 && array1[i] == array2[j]) {
                    result += array1[i]; // or array2[j], because same
                    i++;
                    j++;
                }
            }
        }
        // handling remaining elements of array1
        while (i < l1) {
            sum1 += array1[i];
            i++;
        }
        // handling remaining elements of array2
        while (j < l2) {
            sum2 += array2[j];
            j++;
        }
        // getting the max result here
        result += Math.max(sum1, sum2);
        return result;
    }
}
