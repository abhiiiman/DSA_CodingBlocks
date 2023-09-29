package Coding_Blocks;
import java.util.Scanner;

public class PrintSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        int n2 = input.nextInt();

        int count = 1;
        int n = 1;

        while (count <= n1){
            int temp = 3*(n)+2;
            if (temp%n2 != 0){
                System.out.println(temp);
                count++;
            }
            n++;
        }
    }
}
