package UpGrad_CP;

import java.util.Scanner;

public class DecimalToRoman {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String answer = getRoman(n);
        System.out.println(answer);
    }
    private static String getRoman(int num){
        StringBuilder roman = new StringBuilder();
        int[] storeInt = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] storeRoman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        for (int i = 0; i < storeInt.length; i++) {
            while (num >= storeInt[i]){
                roman.append(storeRoman[i]);
                num -= storeInt[i];
            }
        }
        return roman.toString();
    }
}
