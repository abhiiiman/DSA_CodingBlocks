package Arrays;

public class PrintArray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        print(arr);
    }

    public static int[] print(int[] arr) {
        for (int val: arr) {
            System.out.print(val + " ");
        }
        return arr;
    }
}
