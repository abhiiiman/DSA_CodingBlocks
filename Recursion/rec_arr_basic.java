package Recursion;

public class rec_arr_basic {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
    }

    public static void print_rec(int start, int[] array) {
        if (start == array.length){
            return;
        }
//        BP : p(0,4)
//        SP : p(1,3)
//        kitkat ref
        System.out.println(array[start]);
        print_rec(start+1, array);
    }

}
