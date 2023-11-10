package Strings;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.next();
        boolean result = checkPalindrome(word);
        System.out.println(result);
    }

    public static boolean isPalindrome(String word) {
        int l = 0;
        int r = word.length()-1;
        while (l < r){
            if (word.charAt(l) != word.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    public static boolean checkPalindrome(String word){
        char first = word.charAt(0);
        char last = word.charAt(word.length()-1);
        return first == last;
    }
}
