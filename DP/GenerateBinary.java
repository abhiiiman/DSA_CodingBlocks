package DP;

import java.util.Scanner;

public class GenerateBinary {
    // with no consecutive 1's.
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int t = input.nextInt();
        for (int i = 1; i <= t; i++) {
            int n = input.nextInt();
            int ans = generateNoConsecutive1(n);
            System.out.println(ans);
        }
    }

    private static int generateNoConsecutive1(int n) {
        int zeroEnd = 1; // "0"
        int oneEnd = 1; // "1"
        int sum = zeroEnd + oneEnd; // 2
        int i = 2;
        while (i <= n) {
            oneEnd = zeroEnd;
            zeroEnd = sum;
            sum = zeroEnd + oneEnd;
            i++;
        }
        return sum;
    }
}
