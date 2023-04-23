import java.util.*;

public class ConvertBinaryToDecimal {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();

        for(int i = 0;i<n;i++){
            int m;
            m = ip.nextInt();
            BinaryToDecimal(m);
        }

       
    }

    public static void BinaryToDecimal(int m) {
            int i = 0,s=0;
            while (m>0) {
                s = s+(int)((m%10)*Math.pow(2, i));
                i++;
                m/=10;
            }
            System.out.println(s);
    }
}
