package UpGrad_CP;

import java.util.Scanner;

public class toCustomCase {
    private static String convert(String str) {
        StringBuilder result = new StringBuilder();
        boolean toUpperCase = true;
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                result.append(toUpperCase ? Character.toLowerCase(c) : Character.toUpperCase(c));
                toUpperCase = !toUpperCase;
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.next();
        System.out.printf("Original String : %s%n", word);
        System.out.printf("CustomCase Converted String : %s", convert(word));
    }
}
