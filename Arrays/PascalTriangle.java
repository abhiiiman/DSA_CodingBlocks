package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        List<List<Integer>> result = generate(n);
        System.out.println(result);
    }

    private static List<List<Integer>> generate(int n) {
        List<List<Integer>> result = new ArrayList<>();
        // filling the rows with arrays here.
        for (int i = 0; i < n; i++) {
            Integer[] temp = new Integer[i + 1];
//            filling the array with 1 here.
            Arrays.fill(temp, 1);
//            converting the array into list here for compatibility.
            result.add(Arrays.asList(temp));
        }
        for (int i = 2; i < n; i++) {
            for (int j = 1; j < result.get(i).size() - 1; j++) {
//                adding up value and the leftDiagonal value to the current value here.
                result.get(i).set(j, (result.get(i - 1).get(j - 1) + result.get(i - 1).get(j)));
            }
        }
        return result;
    }
}
