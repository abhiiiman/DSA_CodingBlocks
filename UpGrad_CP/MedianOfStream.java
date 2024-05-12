package UpGrad_CP;

import java.util.Collections;
import java.util.PriorityQueue;

public class MedianOfStream {
    PriorityQueue<Integer> maxHeap;
    PriorityQueue<Integer> minHeap;

    public MedianOfStream() {
        maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        minHeap = new PriorityQueue<>();
    }

    public void insertNum(int num) {
        if (maxHeap.isEmpty() || maxHeap.peek() >= num) {
            maxHeap.add(num);
        } else {
            minHeap.add(num);
        }
        // Either both the heap will have equal elements or max-heap will have one more element.
        if (maxHeap.size() > minHeap.size() + 1) {
            minHeap.add(maxHeap.poll());
        } else if (maxHeap.size() > minHeap.size()) {
            maxHeap.add(minHeap.poll());
        }
    }

    public double findMedian() {
        // Check if both heaps are empty
        if (minHeap.isEmpty() || maxHeap.isEmpty()) {
            throw new IllegalStateException("Both heaps are empty");
        }
        // For even number of elements in both minHeap and maxHeap.
        if (minHeap.size() == maxHeap.size()) {
            return (minHeap.peek() + maxHeap.peek()) / 2.0;
        } else {
            // Because max-heap will have one more element than min-heap.
            return maxHeap.peek();
        }
    }

    public static void main(String[] args) {
        MedianOfStream stream = new MedianOfStream();
        stream.insertNum(3);
        stream.insertNum(1);
        System.out.println("The Median is : " + stream.findMedian());
        stream.insertNum(5);
        System.out.println("The Median is : " + stream.findMedian());
        stream.insertNum(4);
        System.out.println("The Median is : " + stream.findMedian());
    }
}
