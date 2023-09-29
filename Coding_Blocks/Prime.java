package Coding_Blocks;
import java.util.Scanner;
import java.lang.Math;

public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        boolean flag = false;
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                flag = true;
                break;
            }
        }
        if (num == 1){
            System.out.printf("%d is Neither Prime nor Composite.", num);
        }
        else if (!flag){
            System.out.println("prime");
        }
        else{
            System.out.println("non prime");
        }
    }
}
