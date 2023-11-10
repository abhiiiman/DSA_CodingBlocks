package Arrays;

import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> arrayL = new ArrayList<>(); // Integer here is wrapper class.
        arrayL.add(10);
        arrayL.add(20);
        arrayL.add(30);
        arrayL.add(40);
        arrayL.add(50);
        arrayL.add(5, 60);
        System.out.println(arrayL);
        System.out.println(arrayL.size());
        System.out.println(arrayL.get(0));

    }
}
