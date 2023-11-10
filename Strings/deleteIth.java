package Strings;

import java.util.Scanner;

public class deleteIth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Index to be deleted :");
        int idx = input.nextInt();
        System.out.println("Word :");
        String word = input.next();
        System.out.println(deleteI(word, idx));
    }

    public static String deleteI(String word, int idx) {
        String p1 = word.substring(0,idx);
        String p2 = word.substring(idx+1);
        return p1 + p2;
    }
}
