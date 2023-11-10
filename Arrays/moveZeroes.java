package Arrays;

import java.util.Arrays;

public class moveZeroes {
    public static void main(String[] args) {
        int[] myArray = {0,1,0,3,12};
        int[] movedArray = move(myArray);
        System.out.println(Arrays.toString(movedArray));
    }

    public static int[] move(int[] array) {
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0 && array[j] == 0) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
            if (array[j] != 0){
                j++;
            }
        }
        return array;
    }
}
