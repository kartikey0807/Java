import java.util.*;

public class pr {

    public static int fibo2(int n) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else if (n > 2) {
            return fibo2(n - 1) + fibo2(n - 2);
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        int fibonacciValue = fibo2(n);

        if (fibonacciValue == n) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}