import java.util.*;
public class CountADigitThatOccurrInNumber {
    public static void main(String[] args) {
        
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        int d = ip.nextInt();
        
        CountDiz(n,d);
    }
    public static void CountDiz(int n,int d) {
        int c = 0;
        while (n>0) {
            if(d == n%10) c++;
            n/=10;
        }

        System.out.print(c);

    }
}
