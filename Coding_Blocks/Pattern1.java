package Coding_Blocks;
import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int row = 1;
        while (row <= n){
            int count = 0;
            while (count <= n){
                System.out.print("* ");
                count++;
            }
            System.out.println();
            row++;
        }
    }
}
