package Arrays;

import java.util.Scanner;

public class climbNStairs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalStairs = input.nextInt();
        int waysCount = findWays(totalStairs);
        System.out.println(waysCount);
    }

    public static int findWays(int totalStairs) {
        int[] array = new int[totalStairs + 1];
        if (totalStairs == 1){
            return 1;
        }
        array[1] = 1;
        array[2] = 2;
        for (int i = 3; i <= totalStairs; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        return array[totalStairs];
    }
}

// using DP
