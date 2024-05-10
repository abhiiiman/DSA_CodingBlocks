package UpGrad_CP;

import java.util.Scanner;

public class LongestIncreasingSubsequence {
    static int count = 0;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();
        int k = s.nextInt();
        numberOfIncreasingSubSequences(arr, n, k);
        System.out.println(count);
    }

    static void numberOfIncreasingSubSequences(int[] arr, int n, int k) {
        // Iterate through the array and call a helper function for each element
        for (int i = 0; i < n; i++) {
            countIncreasingSubSequences(arr, i, n, k, 1, arr[i]);
        }
    }

    static void countIncreasingSubSequences(int[] arr, int currentIndex, int n, int k, int currentLength, int lastElement) {
        // If the current length of the subsequence is equal to k, increment the count
        if (currentLength == k) {
            count++;
            return;
        }

        // Iterate through the remaining elements and recursively call the function
        for (int i = currentIndex + 1; i < n; i++) {
            if (arr[i] > lastElement) {
                countIncreasingSubSequences(arr, i, n, k, currentLength + 1, arr[i]);
            }
        }
    }
}
