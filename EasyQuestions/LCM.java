import java.util.*;

public class LCM {

    public static void main(String[] args) {

        Scanner ip = new Scanner(System.in);
        int a = ip.nextInt();
        int b = ip.nextInt();

        lcm(a, b);
    }

    public static void lcm(int a, int b) {

        int ans = 0;
        int c = a > b ? a : b;
        for (int i = c; i <= a * b; i++) {
            if (i%a == 0 &&  i%b == 0) {
                ans = i;
                break;
            }
        }

        System.out.println("LCM of " + a + " and " + b + " is : " + ans);
    }

}
