import java.util.*;

public class SmithNumber {
    public static void main(String[] args) {
        /*
         * A Smith number is a composite number, the sum of whose digits is the sum of
         * the digits of its prime factors obtained as a result of prime factorization
         * (excluding 1 )
         */
        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();
        while (t != 0) {
            int n = ip.nextInt();
            int k = n;
            int sum = 0;
            while (n != 0) {
                sum += (n % 10);
                n /= 10;
            }
            int sum1 = 0;
            while (k != 1) {
                int p = 0;
                for (int i = 2; i <= k; i++) {
                    if (k % i == 0) {
                        p = i;
                        k /= i;
                        break;
                    }
                }

                if (p > 9) {
                    while (p != 0) {
                        sum1 += (p % 10);
                        p /= 10;
                    }
                } else {
                    sum1 += p;
                }
            }
            if(sum == sum1){
            System.out.println("Smith Number");
            }
            else{
                System.out.println("Not Smith Number");
            }
            t--;
        }

      

    }

    /*
     * public static int isPrime(int n) {
     * int f = 1;
     * for (int i = 2; i < n; i++) {
     * if (n % i == 0) {
     * f = 0;
     * break;
     * }
     * }
     * return f;
     * }
     * 
     * public static void botonNumberOrJokeNumber(int n) {
     * int sumOfDigits = 0, m = n;
     * while (n > 0) {
     * sumOfDigits += (n % 10);
     * n /= 10;
     * }
     * int sumPrime = 0;
     * for (int i = 2; i <= m; i++) {
     * if (m % i == 0) {
     * int t = isPrime(i);
     * if (t == 1) {
     * int l = i;
     * if(l>9){
     * while (l!=0) {
     * sumPrime += (l%10);
     * l/=10;
     * }
     * 
     * }
     * else{
     * sumPrime += i;
     * }
     * 
     * }
     * }
     * }
     * if (sumOfDigits == sumPrime) {
     * System.out.println("Smith Number");
     * } else {
     * System.out.println("Not Smith Number");
     * }
     * 
     * }
     */
}
