import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        String s = ip.nextLine();
        StringBuffer ans = new StringBuffer("");
        StringBuffer tmp = new StringBuffer("");

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                tmp.reverse();
                ans.append(tmp);
                ans.append(" ");
                tmp = new StringBuffer("");
            } else {
                tmp.append(s.charAt(i));
            }
        }
        tmp.reverse();
        ans.append(tmp);
        System.out.println(ans);
    }
}
