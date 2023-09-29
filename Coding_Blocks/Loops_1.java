package Coding_Blocks;
import java.util.Scanner;

public class Loops_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("n : ");
        int n = input.nextInt();
        int c = 1;
        if (n == 7){
            while (c <= 7){
                System.out.println(c);
                c++;
            }
        }
        else{
            while (c <= 5){
                System.out.println(c);
                c++;
            }
        }
    }
}
