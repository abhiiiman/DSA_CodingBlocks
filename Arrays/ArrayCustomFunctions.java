package Arrays;

import static java.util.Collections.max;

public class ArrayCustomFunctions {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
//        print(arr);
//        int maximum = max(arr);
//        System.out.println();
//        System.out.println(maximum);
//        int myTarget1 = 50;
//        int myTarget2 = 5;
//        System.out.println(find(arr, myTarget1));
//        System.out.println(find(arr, myTarget2));
//        int[] myArray = rotateArray(arr, 2);
//        int[] myArray = reverseArray(arr);
//        int[] myArray = directRotate(arr, 2);
        print(arr); // original
        reverseArray(0, arr.length-1, arr);
        print(arr); // reversed
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

    public static int[] rotateArray(int[] arr, int rotate) {
        rotate = rotate % arr.length;
        for (int r = 0; r < rotate; r++) {
            int last = arr[arr.length-1];
            for (int i = arr.length-2; i >= 0; i--) {
                arr[i+1] = arr[i];
            }
            arr[0] = last;
        }
        return arr;
    }

    public static void reverseArray(int i, int j, int[] arr) {
        while (i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static int[] directRotate(int[] arr, int rot) {
        rot = rot % arr.length;
        reverseArray(0, arr.length-1, arr);
        reverseArray(0, rot-1, arr);
        reverseArray(rot, arr.length-1, arr);
        return arr;
    }

    public static void findAllSubArrays(int[] arr) {
        for (int start = 0; start < arr.length; start++) {
            for (int end = start; end < arr.length; end++) {
                for (int i = start; i <= end; i++) {
                    System.out.print(arr[i] + ' ');
                }
                System.out.println();
            }
        }
        print(arr);
    }
}
