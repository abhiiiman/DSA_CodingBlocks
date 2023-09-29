package Coding_Blocks;
import java.util.Scanner;

public class Splitting_Sequence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int prev = input.nextInt();
        boolean validSequence = true;
        boolean increasingSequence = false;
        int count = 1;
        while (count <= n-1){
            int current = input.nextInt();
            int difference = current - prev;
            if (difference == 0){
                validSequence = false;
            } else if (difference > 0) {
                increasingSequence = true;
            }
            else{
                if (increasingSequence){
                    validSequence = false;
                }
            }
            count++;
            prev = current;
        }
        System.out.println(validSequence);
    }
}
