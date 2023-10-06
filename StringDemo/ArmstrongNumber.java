package StringDemo;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int n = 1000;
        printAllArmstrong(n);
    }

    public static void printAllArmstrong(int n) {
        for (int i = 1; i <= n ; i++) {
            if (isArmStrong(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean isArmStrong(int num) {
        // Done
        int sum = 0;
        int backup = num;
        int countDigit = numOfDigit(num);
        for (int i = 0; i < countDigit; i++) {
            sum += (int) Math.pow(num%10, countDigit);
            num /= 10;
        }
        return sum == backup;
    }

    public static int numOfDigit(int num) {
        // Done
        int count = 0;
        while (num > 0){
            num /= 10;
            count++;
        }
        return count;
    }
}
