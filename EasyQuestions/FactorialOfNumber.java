package EasyQuestions;

import java.util.*;

/**
 * FactorialOfNumber
 */
public class FactorialOfNumber {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        int n = ip.nextInt();

        System.out.println(factorial(n));
    }

    public static int factorial(int n) {
        int ans = 1;

        for (int i = 1; i <= n; i++) {
            ans *= i;
        }
        return ans;
    }
}