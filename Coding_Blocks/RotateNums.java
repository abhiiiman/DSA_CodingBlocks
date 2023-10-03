package Coding_Blocks;
import java.util.Scanner;
import java.lang.Math;

public class RotateNums {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int rot = input.nextInt();
        int backup = num;
        int nod = 0;
        while (num > 0){
            num /= 10;
            nod++;
        }
        num = backup;
        int i = 1;
        while (i <= rot % nod) {
            if (rot % nod != 0){
                int p1 = num / 10;
                int p2 = num % 10;
                num = p1 + p2 * (int) Math.pow(10, nod - 1);
                System.out.println(num);
                i++;
            }
            else{
                System.out.println(num);
            }
        }
    }
}

// this solution is using loops to rotate the numbers. (not optimal)