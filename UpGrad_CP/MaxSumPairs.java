package UpGrad_CP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MaxSumPairs {

    public static void main(String args[]) {
        //below two ArrayList are used to store the given input
        ArrayList<Integer> ArrayL1 = new ArrayList<Integer>();
        ArrayList<Integer> ArrayL2 = new ArrayList<Integer>();

        Scanner in = new Scanner(System.in);
        int n, i;

        // size of ArrayL1 = size of ArrayL2 = n
        n = in.nextInt();

        for (i = 0; i < n; i++) {
            ArrayL1.add(in.nextInt());
        }
        for (i = 0; i < n; i++) {
            ArrayL2.add(in.nextInt());
        }

        // Create a list to store the sums of pairs
        ArrayList<Integer> sums = new ArrayList<>();

        // Calculate the sums of pairs and store them in the list
        for (int num1 : ArrayL1) {
            for (int num2 : ArrayL2) {
                sums.add(num1 + num2);
            }
        }

        // Sort the list of sums in descending order
        Collections.sort(sums, Collections.reverseOrder());

        // Print the first n elements of the sorted list
        for (int j = 0; j < n; j++) {
            System.out.println(sums.get(j));
        }
    }
}
