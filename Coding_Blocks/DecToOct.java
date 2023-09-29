package Coding_Blocks;
import java.util.Scanner;

public class DecToOct {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int decimalNum = input.nextInt();
        int octalNum = 0;
        int countValue = 1;
        while (decimalNum != 0){
            int r = decimalNum % 8;
            octalNum += r*countValue;
            countValue *= 10;
            decimalNum /= 8;
        }
        System.out.println(octalNum);
    }
}
