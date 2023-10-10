package Arrays;

import static java.util.Collections.max;

public class maxArray {
    public static void main(String[] args) {
        int[] arr = {-10,20,30,40,-50};
        print(arr);
        int maximum = max(arr);
        System.out.println();
        System.out.println(maximum);
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
}
