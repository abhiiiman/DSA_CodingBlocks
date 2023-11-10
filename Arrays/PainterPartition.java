package Arrays;

import java.util.Scanner;

public class PainterPartition {
    public static void main(String[] args) {
        // input format.
        Scanner input = new Scanner(System.in);
        int painters = input.nextInt();
        int boards = input.nextInt();
        int[] array = new int[boards];
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        // allocate the boards;
//        int result = allocateBoards(array, painters);
//        System.out.println(result);
    }
    public static boolean isValid(int[] array, int time, int painters){

        return false;
    }
}
