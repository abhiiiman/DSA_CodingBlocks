package Recursion;

import java.util.Scanner;

public class climbStairs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int ways = climb(num);
        System.out.println(ways);
    }
    public static int climb(int totalStairs) {
        if (totalStairs == 0){
            return 0;
        }
        else if (totalStairs == 1){
            return 1;
        } else if (totalStairs == 2) {
            return 2;
        }
        else {
            return climb(totalStairs-1) + climb(totalStairs-2);
        }
    }
}
