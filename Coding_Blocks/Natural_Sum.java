package Coding_Blocks;
import java.util.Scanner;

public class Natural_Sum {
    public static void main(String[] args) {
        System.out.println("Enter the N value : ");
        Scanner input = new Scanner(System.in);
        int end_range = input.nextInt();
        int c = 1;
        int sum = 0;
        while (c <= end_range){
            sum += c;
            c++;
        }
        System.out.printf("The sum of %d is %d",end_range,sum);
    }
}
