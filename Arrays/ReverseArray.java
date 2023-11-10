package Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        System.out.println("Original Array");
        printArray(arr);
        System.out.println("Reversed Array");
        reverseArray(arr);
        printArray(arr);
    }

    public static void printArray(int[] array) {
        for (int val: array) {
            System.out.printf("%d ", val);
        }
        System.out.println();
    }

    public static void reverseArray(int[] array) {
        int i = 0;
        int j = array.length-1;
        while (i < j){
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;j--;
        }
    }
}
