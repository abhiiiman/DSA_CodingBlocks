package UpGrad_CP;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class MinimumSwapsToSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }
        int answer = getMinSwaps(array);
        System.out.println(answer);
    }

    //    performing Swap operation here.
    private static void swapIdx(int[] array, int idx1, int idx2) {
        int temp = array[idx1];
        array[idx1] = array[idx2];
        array[idx2] = temp;
    }

    //    getting the min swaps to sort the array from here.
    private static int getMinSwaps(int[] array) {
        int swapCount = 0;
        int[] temp = array.clone();
//        creating the map here to store the elements wrt their indices.
        HashMap<Integer, Integer> map = new HashMap<>();
//        filling the map here from the array.
        for (int i = 0; i < array.length; i++) {
            map.put(array[i], i);
        }
        Arrays.sort(temp);

        for (int i = 0; i < array.length; i++) {
//            if the element is not in the correct position.
            if (array[i] != temp[i]) {
//                increase the swap count.
                swapCount++;
                int init = array[i];
//                swapping the array here.
                swapIdx(array, i, map.get(temp[i]));
//                updating the map here after swapping using the same indices.
                map.put(init, map.get(temp[i]));
                map.put(temp[i], map.get(i));
            }
        }
        System.out.println("Original Array : " + Arrays.toString(array));
        System.out.println("Sorted Array : " + Arrays.toString(temp));
        return swapCount;
    }
}
