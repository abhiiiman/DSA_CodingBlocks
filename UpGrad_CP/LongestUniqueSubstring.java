package UpGrad_CP;

import java.util.Scanner;

public class LongestUniqueSubstring {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        int maxLength = lengthOfLongestSubstring(str);
        System.out.println(maxLength);
    }

    private static int lengthOfLongestSubstring(String s) {
        int maxLen = Integer.MIN_VALUE; // overall max length
        int i = 0; // acquire pointer.
        int j = -1; // release pointer.
        if (s.isEmpty()) return 0; // edge case for empty string.
        boolean[] set = new boolean[256]; // boolean array for chars
        while (i < s.length()) {
            char ch_to_acquire = s.charAt(i);
            while (set[ch_to_acquire]) {
                j++; // increment j to release the repeating chars.
                char ch_to_release = s.charAt(j); // release the char at j
                set[ch_to_release] = false; // make it false as it is released.
            }
            // acquiring the non-repeating chars here.
            set[ch_to_acquire] = true;
            maxLen = Math.max(maxLen, i - j); // i-j is the current length.
            i++; // increment i to acquire the non-repeating chars.
        }
        return maxLen;
    }
}
