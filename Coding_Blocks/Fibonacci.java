package Coding_Blocks;

public class Fibonacci {

    public static void n_Fibonacci(int number){
        int count = 2;
        int c = -1;
        int a = 0;
        int b = 1;
        while (count <= number){
            c = a + b;
            a = b;
            b = c;
            count++;
            System.out.println(c);
        }
        System.out.printf("%dth term of the fibonacci series is %d", number, c);
    }

    public static void main(String[] args) {
        n_Fibonacci(10);
    }
}
