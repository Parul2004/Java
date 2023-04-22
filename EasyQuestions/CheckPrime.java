import java.util.*;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        int n = ip.nextInt();

        checkPrime(n);
    }

    public static void checkPrime(int n) {
        int f = 1;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                f = 0;
                break;
            }
        }
        if (f == 0) {
            System.out.print("Not Prime");
        } else {
            System.out.print("Prime");
        }
    }
}
