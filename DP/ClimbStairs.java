package DP;

import java.util.Arrays;
import java.util.Scanner;

public class ClimbStairs {
    static int dpCount = 0;
    static int recCount = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] array = new int[n + 1];
        int pathsRec = countPathsRec(n);
        int pathsDP = countPathsDP(n, array);
        int ansTab = countPath(n);
        System.out.println("Total Climb Ways -> " + pathsDP);
        System.out.println("Recursive Counts -> " + recCount);
        System.out.println("DP Counts -> " + dpCount);
    }

//    using recursion
    public static int countPathsRec(int n) {
        if (n == 0) {
            return 1;
        } else if (n < 0) {
            return 0;
        }
        recCount++;
//        System.out.println("Call for -> " + n);
        int x = countPathsRec(n - 1);
        int y = countPathsRec(n - 2);
        return x + y;
    }

//    using DP
    public static int countPathsDP(int n, int[] qb) {
        if (n == 0) {
            return 1;
        } else if (n < 0) {
            return 0;
        }
        if (qb[n] != 0) {
            return qb[n];
        }
        System.out.println("Call for -> " + n);
        dpCount++;
        int x = countPathsDP(n - 1, qb);
        int y = countPathsDP(n - 2, qb);
//        int z = countPathsDP(n - 3, qb);
        int total = x + y;
        qb[n] = total;
        return total;
    }

    // iterative approach using tabulation.
    private static int countPath(int n) {
        int[] db = new int[n + 1];
        db[0] = 1;
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                db[i] = db[i - 1];
            } else {
                db[i] = db[i - 1] + db[i - 2];
            }
        }
        System.out.println(Arrays.toString(db));
        return db[n];
    }
}
