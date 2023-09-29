package Coding_Blocks;
import java.util.Scanner;

public class IncDecSeq {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int prev = scanner.nextInt();
        boolean decreasing = true;
        boolean increasing = false;

        for (int i = 1; i < N; i++) {
            int current = scanner.nextInt();

            if (decreasing && current < prev) {
                decreasing = true;
                increasing = false;
            } else if (!increasing && current > prev) {
                increasing = true;
                decreasing = false;
            } else {
                System.out.println("false");
                return;
            }

            prev = current;
        }

        if (increasing || decreasing) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}

// ispe kaam baaki hai abhi.