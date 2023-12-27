package Strings;

import java.util.*;

public class obedientString {
    // global flag
    static boolean answer = false;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String original = input.next();
        String current = "a";
        generate(original, current);
        System.out.println(answer);
    }

    public static void generate(String original, String current) {
        // when complete string mismatched. Bounding case.
        if (!original.startsWith(current)) {
            return;
        }
        // when complete string matched.
        if (original.equals(current)) {
            answer = true;
            return;
        }
        // branching further from a.
        if (current.endsWith("a")) {
            generate(original, current + "a");
            generate(original, current + "bb");
        }
        // branching further from bb.
        else if (current.endsWith("bb")) {
            generate(original, current + "a");
        }
    }
}
