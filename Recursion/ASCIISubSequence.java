package Recursion;

import java.util.Scanner;

public class ASCIISubSequence {
    static int totalCombos = 0;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String original = input.next();
        String current = "";
        makeCombos(original, current);
        System.out.println("\n" + totalCombos);
    }

    public static void makeCombos(String original, String current) {
//        termination condition.
        if (original.isEmpty()){
            System.out.print(current + " ");
            totalCombos++;
            return;
        }
        else{
//            BP - "abcd"
//            SP - "bcd"
//            frens - team ref
            String sp = original.substring(1);
            char ch = original.charAt(0);
            makeCombos(sp, current); // excluding - bounded (first as per the question, can be changed)
            makeCombos(sp, current + ch); // include - branched
            makeCombos(sp, current + (int) ch); // include + ASCII - branched
        }
    }
}
