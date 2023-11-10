package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class Pair_of_Roses {
    public static void main(String[] args) {
        // TODO : test case handle
//        int t = Scanner
    }

    public static void selectBestPair(int[] array, int maxAmount) {
        Arrays.sort(array);
        int l = 0;
        int r = array.length-1;
        int l_rose = -1;
        int r_rose = -1;

        while (l < r){
            if (array[l] + array[r] == maxAmount){
                l_rose = array[l];
                r_rose = array[r];
                l++;
                r--;
            } else if (array[l] + array[r] < maxAmount) {
                l++;
            }
            else {
                r--;
            }
        }
        // TODO : print in provided format
    }
}
