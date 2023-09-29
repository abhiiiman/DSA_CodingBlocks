package Coding_Blocks;
import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        for (int i = 0; i < N; i++) {
            int num = input.nextInt();
            if (isAllowed(num)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }

    static boolean isAllowed(int num) {
        int sum = 0;
        int originalNum = num;

        // Calculate the sum of digits
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        // Check if the sum satisfies the conditions
        if (sum % 3 == 0) {
            return true;
        }

        num = originalNum;
        sum = 0;

        // Calculate the sum of even-positioned digits
        int position = 1;
        while (num > 0) {
            int digit = num % 10;
            if (position % 2 == 0) {
                sum += digit;
            }
            num /= 10;
            position++;
        }

        // Check if the sum of even-positioned digits satisfies the condition
        return sum % 4 == 0;
    }
}
