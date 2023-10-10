package Arrays;

import java.util.Arrays;

public class ArrayBasics {
    public static void main(String[] args) {
        int len = 10;
        int[] arr = new int[len];

        for (int i = 0; i < len; i++) {
            arr[i] = 5*(i+1);
            System.out.printf("%d x %d = %d\n", 5, i+1, arr[i]);
        }
        System.out.println(Arrays.toString(arr));

        for (int val:
             arr) {
            System.out.print(val + " ");
        }
    }
}
