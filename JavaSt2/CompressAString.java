import java.util.Scanner;

public class CompressAString {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        String s = ip.next();
        String ans="";
        for(int i = 0;i<s.length();i++){
            int c = 1;
            char ch = s.charAt(i);
            while(i<s.length()-1 && ch == s.charAt(i+1)){
                c++;
                i++;
            }

            ans+=ch;
            ans = ans+c;

        }

        System.out.println(ans);
    }
}
