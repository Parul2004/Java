
import java.util.*;
public class StringCompression {
    public static void main(String args[]) {
      Scanner ip = new Scanner(System.in);
      String s = ip.next();
      int n = s.length();
      String ans="";
      for(int i = 1;i<s.length();i++){
          char ch = s.charAt(i-1);
          int c = 1;
          if(i!=n+1){
           while(ch == s.charAt(i-1) && i<=n){
             c++;
             i++;
          }
          }
         

          ans+=ch;
          ans = ans+Integer.toString(c);
          c = 1;
      }
      System.out.print(ans);
    }
}