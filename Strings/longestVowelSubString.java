package Strings;
import java.util.Scanner;
public class longestVowelSubString {
    static int count = 0;
    static int maxCount = 0;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String original = input.next();
        int answer = findLongestSubString(original);
        System.out.println(answer);
    }
    public static int findLongestSubString(String original) {
        for (int i = 0; i < original.length(); i++) {
            char ch = original.charAt(i);
            if (isVowel(ch)){
                count++;
            }
            else{
                count = 0;
            }
            maxCount = Math.max(count, maxCount);
        }
        return maxCount;
    }
    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}