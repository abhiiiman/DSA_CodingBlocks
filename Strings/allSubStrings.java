package Strings;

import java.util.Scanner;

public class allSubStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        findAllSubString(str);
        int count = countAllSubStrings(str);
        System.out.println("Count  = " + count);
    }
    public static void findAllSubString(String word) {
        int count = 1;
        for (int i = 0; i < word.length(); i++) {
            for (int j = i+1; j < word.length()+1; j++) {
                System.out.println(count + ". " + word.substring(i,j));
                count++;
            }
        }
    }
    public static int countAllSubStrings(String word){
        int n = word.length();
        return n*(n+1)/2;
    }
}
