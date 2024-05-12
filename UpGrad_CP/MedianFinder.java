package UpGrad_CP;

import java.util.Collections;
import java.util.PriorityQueue;

public class MedianFinder {
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();

    public void addNum(int num) {
        // Adding to the right here.
        if (!minHeap.isEmpty() && minHeap.peek() <= num) {
            minHeap.add(num);
        } else {
            // Adding to the left here.
            maxHeap.add(num);
        }
        // Balancing the heaps here.
        // Difference of size should be either 0 or 1.
        if (minHeap.size() - maxHeap.size() == 2) {
            maxHeap.add(minHeap.poll());
        } else if (maxHeap.size() - minHeap.size() == 2) {
            minHeap.add(maxHeap.poll());
        }
    }

    public double findMedian() {
        // Check if both heaps are empty
        if (maxHeap.isEmpty() || minHeap.isEmpty()) {
            throw new IllegalStateException("Both heaps are empty");
        }

        // Even size
        if (maxHeap.size() == minHeap.size()) {
            return (double) (maxHeap.peek() + minHeap.peek()) / 2.0;
        } else {
            // Odd size, so return the top of maxHeap
            return (double) maxHeap.peek();
        }
    }

    public static void main(String[] args) {
        MedianFinder stream = new MedianFinder();
        stream.addNum(3);
        stream.addNum(1);
        System.out.println("The Median is : " + stream.findMedian());
        stream.addNum(5);
        System.out.println("The Median is : " + stream.findMedian());
        stream.addNum(4);
        System.out.println("The Median is : " + stream.findMedian());
    }
}
