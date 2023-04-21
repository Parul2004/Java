import java.util.*;

public class PrimeNumberOrNot {
    public static void main(String[] args) {

        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();

        PrimeOrNot(n);
    }

    public static void PrimeOrNot(int n) {
        boolean flag = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                flag = false;
            }
        }
        if (flag) {
            System.out.println(n + " is Prime");
        } else {
            System.out.println(n + " is Not Prime");
        }
       
    }
}
