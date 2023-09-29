package Coding_Blocks;
import java.lang.Math;

public class PrimeNum {
    public static void PrimeCheck(long number){
        int count = 0; //factor counts.
        int i = 1;
        while (i <= Math.sqrt(number)){
            if (number % i == 0){
                count += 1;
            }
            i++;
        }
        if (number == 1){
            System.out.printf("%d is Neither Prime nor Composite.", number);
        }
        else if (count == 2){
            System.out.printf("%d is a Prime Number.", number);
        }
        else{
            System.out.printf("%d is Not a Prime Number.", number);
        }
    }
    public static void main(String[] args) {
        PrimeCheck(10);
    }
}
