package UpGrad_CP;

import java.util.Scanner;

public class findDuplicateMissing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }
        solve(array);
    }

    private static void solve(int[] array) {
        int xor = 0;
//        performing and with each array element top cancel out the dupes.
        for (int element : array) {
            xor ^= element;
        }
//        performing and with the range of number to find the missing element.
        for (int i = 1; i <= array.length; i++) {
            xor ^= i;
        }
//        now finding the missing and the dupe number here.
        int rsb = xor & -xor;

        int x = 0;
        int y = 0;

        for (int val : array) {
            if ((val & rsb) == 0) {
                x = x ^ val;
            } else {
                y = y ^ val;
            }
        }

        for (int i = 1; i <= array.length; i++) {
            if ((i & rsb) == 0) x = x ^ i;
            else y = y ^ i;
        }

        for (int val : array) {
            if (val == x) {
                System.out.println("Missing Number -> " + y);
                System.out.println("Duplicate Number -> " + x);
                break;
            } else if (val == y) {
                System.out.println("Missing Number -> " + x);
                System.out.println("Duplicate Number -> " + y);
                break;
            }
        }
    }
}
