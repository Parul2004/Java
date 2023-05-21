import java.util.*;

public class SetBQuestion2 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();

        System.out.println(count1Bits(n));
    }

    public static int count1Bits(int n) {
            int o = 0;
            while(n!=0){
                if(n%2==1){
                    o++;
                }
                n/=2;
            }
            return o;
    }
}
