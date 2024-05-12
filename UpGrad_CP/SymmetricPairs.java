package UpGrad_CP;

import java.util.HashMap;
import java.util.Scanner;

class SymmetricPairs {

    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);

        // number of pairs in the array
        int n = in.nextInt();
        int[][] arr = new int[n][2];

        // store the input pairs to an array "arr"
        for (int i = 0; i < n; i++) {
            arr[i][0] = in.nextInt();
            arr[i][1] = in.nextInt();
        }

        // Write your code here
        findSymmetricPairs(arr);
    }

    // Method to find and print symmetric pairs
    static void findSymmetricPairs(int[][] arr) {
        // HashMap to store pairs
        HashMap<Integer, Integer> map = new HashMap<>();

        boolean foundSymmetricPair = false;

        // Traverse the array of pairs
        for (int[] ints : arr) {
            int first = ints[0];
            int second = ints[1];

            // Check if the reverse pair exists in the HashMap
            if (map.containsKey(second) && map.get(second) == first) {
                // Print the pair that appeared first in the array
                System.out.println(second + " " + first);
                foundSymmetricPair = true;
            } else {
                // Add the pair to the HashMap
                map.put(first, second);
            }
        }

        // If no symmetric pairs were found, print 'No Symmetric pair'
        if (!foundSymmetricPair) {
            System.out.println("No Symmetric pair");
        }
    }
}
