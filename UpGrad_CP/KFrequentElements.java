package UpGrad_CP;

import java.util.*;
import java.util.ArrayList;

public class KFrequentElements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < args.length; i++) {
            arr[i] = input.nextInt();
        }
        int k = input.nextInt();
        int[] topK = topKFrequent(arr, k);
        System.out.println(Arrays.toString(topK));
    }

    private static int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] bucket = new List[nums.length + 1];
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        // Count the frequency of each number
        for (int n : nums) {
            freqMap.put(n, freqMap.getOrDefault(n, 0) + 1);
        }

        // Put numbers into buckets based on frequency
        for (int key : freqMap.keySet()) {
            int freq = freqMap.get(key);
            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(key);
        }

        int[] result = new int[k];
        int counter = 0;

        // Iterate over the buckets in descending order of frequency
        for (int pos = bucket.length - 1; pos >= 0 && counter < k; pos--) {
            if (bucket[pos] != null) {
                // Sort the elements within the bucket
                Collections.sort(bucket[pos], Collections.reverseOrder());
                // Add elements from the current bucket to the result array
                for (int num : bucket[pos]) {
                    result[counter++] = num;
                    if (counter == k) {
                        break;
                    }
                }
            }
        }
        return result;
    }
}
