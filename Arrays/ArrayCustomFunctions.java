package Arrays;

import static java.util.Collections.max;

public class ArrayCustomFunctions {
    public static void main(String[] args) {
        int[] arr = {-10,20,30,40,-50};
        print(arr);
        int maximum = max(arr);
        System.out.println();
        System.out.println(maximum);
        int myTarget1 = 50;
        int myTarget2 = 5;
        System.out.println(find(arr, myTarget1));
        System.out.println(find(arr, myTarget2));
    }

    public static int[] print(int[] arr) {
        for (int val: arr) {
            System.out.print(val + " ");
        }
        return arr;
    }

    public static int max(int[] arr) {
        int maxNumber = Integer.MIN_VALUE; // starting from the least integer value to compare all the integers.
        for (int val:arr) {
            if (val > maxNumber){
                maxNumber = val;
            }
        }
        return maxNumber;
    }

    public static int find(int[] arr, int target) {
        for (int idx = 0; idx < arr.length-1; idx++) {
            if (arr[idx] == target){
                return idx;
            }
        }
        return -1;
    }
}
