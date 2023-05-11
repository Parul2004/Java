import java.util.Scanner;

public class TakingOutNumericValueFromAString {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        String st = ip.next();

        int sum = 0;
        String ans = "";
        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i) >= '0' && st.charAt(i) <= '9') {
                ans+=st.charAt(i);
                sum += (st.charAt(i) - '0');
            }
        }
        System.out.println(ans);
        System.out.println(sum);
    }
}
