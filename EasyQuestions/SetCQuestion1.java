import java.util.*;
public class SetCQuestion1 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int a = ip.nextInt();
        int b = ip.nextInt();
        int c = ip.nextInt();

        int res1 = Math.max(a,b);
        int res2 = Math.max(res1,c);
        System.out.println(res2+" is the largest number");
    }
}
