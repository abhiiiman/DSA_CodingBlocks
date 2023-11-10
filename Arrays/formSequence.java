package Arrays;

import java.util.Scanner;
import java.util.Stack;

public class formSequence {
    public static void main(String[] args) {
        // input format.
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String[] array = new String[n];
        for (int i = 0; i < n; i++) {
            array[i] = input.next();
        }
        // main code
        for (String word : array) {
            formMinSequence(word);
        }
    }

    public static void formMinSequence(String word) {
        int num = 1;
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch == 'D') {
                st.push(num);
                num++;
            } else {
                st.push(num);
                num++;
                while (st.size() > 0) {
                    System.out.print(st.pop());
                }
            }
        }
        st.push(num);
        while (st.size() > 0) {
            System.out.print(st.pop());
        }
        System.out.println();
    }
}
