package Arrays;

import java.util.Scanner;

public class publicTransport {
    public static void main(String[] args) {
        // input format
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t > 0) {
            int c1 = input.nextInt();
            int c2 = input.nextInt();
            int c3 = input.nextInt();
            int c4 = input.nextInt();
            int n = input.nextInt();
            int m = input.nextInt();
            int[] a = new int[n];
            int[] b = new int[m];
            for (int i = 0; i < n; i++) {
                a[i] = input.nextInt();
            }
            for (int j = 0; j < m; j++) {
                b[j] = input.nextInt();
            }
            // main code
            t--;
        }
    }
}
