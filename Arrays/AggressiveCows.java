package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AggressiveCows {
    public static void main(String[] args) {
        // input format.
        Scanner input = new Scanner(System.in);
        int stalls = input.nextInt();
        int cows = input.nextInt();
        int[] array = new int[stalls];
        for (int i = 0; i < stalls; i++) {
            array[i] = input.nextInt();
        }
        // allocating the stalls to cows.
        int result = allocateStalls(array, cows);
        System.out.println(result);
    }
    public static boolean canWePlace(int[] array, int dist, int cows){
        int countCows = 1;
        int lastPlacedStall = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] - lastPlacedStall >= dist){
                countCows++;
                lastPlacedStall = array[i];
            }
            if (countCows >= cows){
                return true;
            }
        }
        return false;
    }
    public static int allocateStalls(int[] array, int cows){
        Arrays.sort(array);
        int size = array.length;
        int ans = -1;
        int low = 0;
        int high = array[size-1] - array[0];
        while (low <= high) {
            int mid = (low + high) / 2;
            if (canWePlace(array, mid, cows)){
                ans = mid;
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return high;
    }
}
