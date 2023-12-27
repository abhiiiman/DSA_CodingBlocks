package Arrays;

import java.util.Scanner;

public class FirstMissingNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }
        int missingNum = firstMissingPositive(array);
        System.out.println(missingNum);
    }

    public static int firstMissingPositive(int[] array) {
        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;
        for (int value: array) {
            maxNum = Math.max(maxNum, value);
            minNum = 1;
        }
        // checking for the element here
        int missingNumber = 0;
        for (int i = minNum; i <= maxNum + 1; i++) {
            for (int value : array) {
                if (value == i){
                    continue;
                }
            }
            missingNumber = i;
            break;
        }
        return missingNumber;
    }
}
