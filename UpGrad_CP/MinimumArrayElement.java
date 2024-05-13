package UpGrad_CP;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumArrayElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
//        int answer = findMinimum(arr);
        int answer = getMinimum(arr, arr.length);
        System.out.println(answer);
    }

    private static int findMinimum(int[] arr) {
        Arrays.sort(arr);
        return arr[0];
    }

    private static int getMinimum(int[] arr, int size) {
        if (size == 1) return arr[0];
        return Math.min(arr[size - 1], getMinimum(arr, size-1)); // compare last element with the complete array everytime.
    }
}
