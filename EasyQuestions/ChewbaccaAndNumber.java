import java.util.*;

public class ChewbaccaAndNumber {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        long n = ip.nextLong();

        changeNum(n);
    }

    public static void changeNum(long n) {
        long m = n;
        long c = 0;
        while (m!=0) {
            c++;
            m/=10;
        }
        long i = 0;

        long s = 0, a = 0;
        while (n != 0) {
            a = n % 10;
            if(i==c-1 && a == 9){
                s = s * 10 + a;
                n/=10;
                continue;
            }
            else{
                if (a >= 5 && a <= 9) {
                    a = 9 - a;
                }
            }
            i++;
            s = s * 10 + a;
            n /= 10;
        }
        System.out.println(s);
        long ans = 0;
        while (s != 0) {
            ans = (ans * 10) + (s % 10);
            s /= 10;
        }
        System.out.println(ans);
    }
}
