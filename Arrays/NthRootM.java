package Arrays;

import java.util.Scanner;

public class NthRootM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for (int i = 0; i < t; i++) {
            int n = input.nextInt();
            int m = input.nextInt();
            // Calculate Nth root of M
            double result = Math.pow(m, 1.0/n);
            // Check if the result is an integer
            if (Math.pow((int) result, n) == m){
                System.out.println((int) result);
            }
            else{
                System.out.println(-1);
            }
        }
    }
}
