package UpGrad_CP;

import java.util.Scanner;

public class TwoPeopleMeet {
    public static void main(String[] args) {
//        creating the scanner class here for the input.
        Scanner input = new Scanner(System.in);
//        getting the input here.
        int p1 = input.nextInt();
        int p2 = input.nextInt();
        int s1 = input.nextInt();
        int s2 = input.nextInt();
//        creating the method to find the two persons will meet each other or not.
        String answer = twoPeopleMeet(p1, p2, s1, s2);
        System.out.println(answer);
    }

    private static String twoPeopleMeet(int p1, int p2, int s1, int s2) {
        if ((p1 > p2 && s1 < s2 && (p1 - p2) % (s1 - s2) == 0) || (p2 > p1 && s2 < s1 && (p2 - p1) % (s2 - s1) == 0)) return "Yes";
        else return "No";
    }
}
