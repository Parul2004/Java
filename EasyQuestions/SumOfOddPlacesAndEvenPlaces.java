import java.util.*;

public class SumOfOddPlacesAndEvenPlaces {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();

        countOddEven(n);
    }

    public static void countOddEven(int n) {
        int s = 0, m = n, i = 0;

        while (n != 0) {
            s = (s * 10) + (n % 10);
            n /= 10;
        }

        int e = 0, o = 0;
        while (m != 0) {
            if (i % 2 == 0) {
                e += (m % 10);
            } else {
                o += (m % 10);
            }
            i++;
            m /= 10;
        }

        System.out.print(e+"\n"+o);

    }
}
