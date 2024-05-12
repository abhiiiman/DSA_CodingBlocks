package UpGrad_CP;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class KLargestElements {
    private static void findKLargest(int[] arr, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(); // default PQ `min` will get peeked.
        // add up-to k  elements first in the PQ.
        for (int i = 0; i < arr.length; i++) {
            if (i < k) {
                minHeap.add(arr[i]);
            } else {
                if (arr[i] > minHeap.peek()) {
                    minHeap.remove(); // worst will get removed.
                    minHeap.add(arr[i]); // better than worst will be added.
                }
            }
        }
        // print the k largest elements here.
        while (!minHeap.isEmpty()) {
            System.out.print(minHeap.remove() + " ");
        }
    }

    public static void main(String[] args) {
        //    getting the input from the user here.
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        int k = input.nextInt();
        System.out.println("Original Input Array :");
        System.out.println(Arrays.toString(arr));
        System.out.printf("Top %d elements from the list are :%n", k);
        findKLargest(arr, k);
    }
}
