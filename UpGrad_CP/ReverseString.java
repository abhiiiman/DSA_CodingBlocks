package UpGrad_CP;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        String ans1 = reverseString(str);
        String ans2 = reversePattern(str);
        System.out.printf("Original String : %s%n", str);
        System.out.printf("Normal Reverse String : %s%n", ans1);
        System.out.printf("Pattern Reverse String : %s%n", ans2);
    }

    private static String reverseString(String str) {
        char[] charArray = str.toCharArray();
        int left = 0;
        int right = str.length() - 1;

        // Swap characters from left and right pointers until they meet in the middle
        while (left < right) {
            // Swap characters
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            // Move pointers inward
            left++;
            right--;
        }

        // Convert char array back to string
        return new String(charArray);
    }

    private static String reversePattern(String str) {
        char[] charArray = str.toCharArray();
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (!Character.isLetter(charArray[start])) start++;
            else if (!Character.isLetter(charArray[end])) end--;
            else {
                char temp = charArray[start];
                charArray[start] = charArray[end];
                charArray[end] = temp;
                start++;
                end--;
            }
        }
        return new String(charArray);
    }
}
