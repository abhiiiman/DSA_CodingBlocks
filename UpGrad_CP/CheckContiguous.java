package UpGrad_CP;

import java.util.*;

class CheckContiguous {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        // array to store the input elements
        int[] array = new int[n];

        // storing the elements to the array
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }

        // sorting the array
        Arrays.sort(array); // 2, 3, 4, 4, 5, 6, 6, 7, 7, 8

        // traversing the sorted array to check for the contiguous nature
        boolean isContiguous = true;
        for (int i = 0; i < array.length - 1; i++){
            if (array[i+1] - array[i] > 1) { // allow only 0 and 1 above that will not be contiguous.
                isContiguous = false;
                break;
            }
        }

        // printing the result
        if (array.length == 0) System.out.println(false); // if array is empty.
        else System.out.println(isContiguous);
    }
}
