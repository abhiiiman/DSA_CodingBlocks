package UpGrad_CP;

import java.util.*;

public class NextLargest {
    public static void main(String[] args) {
        String str;
        Scanner s = new Scanner(System.in);
        str = s.nextLine();
        nextLargestNumber(str);
    }

    // Method to find the next largest number possible with only one swap allowed
    static void nextLargestNumber(String str) {
        int n = str.length();
        // converting string to StringBuilder form
        StringBuilder s = new StringBuilder(str);
        int i = n - 1;
        // Finding rightmost digit which is less than digit to it's right
        while (i > 0 && s.charAt(i) <= s.charAt(i - 1))
            i--;
        int j = i - 1;
        // j=-1 implies given number is the maximum that can be formed with the digits in the given string
        if (j >= 0) {
            int requiredIndex = i;
            i++;
            // Finding minimum digit which is greater than the digit at jth index and to the right of jth index
            while (i < n && s.charAt(i) > s.charAt(j)) {
                if (s.charAt(i) < s.charAt(requiredIndex))
                    requiredIndex = i;
                i++;
            }
            // Swapping the digit at jth index and the digit at requiredIndex index
            char temp = s.charAt(j);
            s.setCharAt(j, s.charAt(requiredIndex));
            s.setCharAt(requiredIndex, temp);
            System.out.println(s);
        }
        // If given number is the largest number that can be formed with the digits in the given number
        else
            System.out.println("Not Possible");
    }
}
