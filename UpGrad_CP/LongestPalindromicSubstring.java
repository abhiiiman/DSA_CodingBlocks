package UpGrad_CP;

import java.util.Scanner;

public class LongestPalindromicSubstring {
    private static String longestPalindrome(String str) {
        String result = "";
        // testing odd lengths palindrome here.
        for (int axis = 0; axis < str.length(); axis++) {
            int orbit = 1;
            int len = 1;
//            tracking the axis and orbit and keep them within the range here.
            while (axis - orbit >= 0 && axis + orbit < str.length()) {
                if (str.charAt(axis - orbit) == str.charAt(axis + orbit)) {
                    orbit++;
                    len += 2;
                } else {
                    break;
                }
            }
            if (len > result.length()) {
                int startIdx = axis - len / 2;
                result = str.substring(startIdx, startIdx + len);
            }
        }

//        testing the even length palindrome here.
        for (int axis = 0; axis < str.length() - 1; axis++) {
            int orbit = 1;
            int len = 0;
            while (axis - orbit + 1 >= 0 && axis + orbit < str.length()) {
                if (str.charAt(axis - orbit + 1) == str.charAt(axis + orbit)) {
                    orbit++;
                    len += 2;
                } else {
                    break;
                }
            }
            if (len > result.length()) {
                int startIdx = axis - len / 2 + 1;
                result = str.substring(startIdx, startIdx + len);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.next();
        System.out.println("Original Word : " + word);
        String longestPalindrome = longestPalindrome(word);
        System.out.println("Longest Palindrome Substring : " + longestPalindrome);
    }
}
