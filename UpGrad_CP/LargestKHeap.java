package UpGrad_CP;

import java.util.PriorityQueue;
import java.util.Scanner;

public class LargestKHeap {
    public static void main(String[] args) {
//      getting the input for elements and k here.
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int[] elements = new int[num];
        for (int i = 0; i < num; i++) {
            elements[i] = input.nextInt();
        }
        int k = input.nextInt();
        // find the largest k element here
        int largestK = findLargestK(elements, k);
        System.out.println(largestK);
    }

    public static int findLargestK(int[] elements, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < elements.length; i++) {
            // add until k size to the minHeap
            if (i < k) {
                pq.add(elements[i]);
            } // start dropping the lowest priority element of the kth group.
            else {
                if (pq.peek() != null && elements[i] > pq.peek()) {
                    pq.remove();
                    pq.add(elements[i]);
                }
            }
        }
        // printing the final kth group
//        while (!pq.isEmpty()) {
//            System.out.println(pq.remove());
//        }
        // return the k Largest element.
        return pq.remove();
    }
}