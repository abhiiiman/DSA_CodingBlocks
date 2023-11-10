package Arrays;

import java.util.Scanner;

public class BookAllocation {
    public static void main(String[] args) {
        // input format
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for (int i = 0; i < t; i++) {
            int n = input.nextInt(); // books
            int m = input.nextInt(); // students
            int[] pages = new int[n]; // book pages array
            for (int j = 0; j < n; j++) {
                pages[j] = input.nextInt();
            }
            // main
            int minPages = allocateBook(pages, n, m);
            System.out.println(minPages);
        }
    }

    public static boolean isValid(int[] array, int n, int m, int maxPage) {
        int student = 1;
        int pageSum = 0;
        for (int i = 0; i < n; i++) {
            pageSum += array[i];
            if (pageSum <= maxPage) {
                student++;
                pageSum = array[i];
            }
            if (student > m) {
                return false;
            }
        }
        return true;
    }

    public static int allocateBook(int[] array, int n, int m) {
        if (m > n) return -1;
        int end = 0;
        int start = Integer.MAX_VALUE;
        for (int value : array) {
            end += value;
            if (start > value) {
                start = value;
            }
        }
        int result = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (isValid(array, n, m, mid)) {
                result = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return result;
    }
}
