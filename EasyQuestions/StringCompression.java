
import java.util.*;
public class StringCompression {
    public static void main(String args[]) {
      Scanner ip = new Scanner(System.in);
      String s = ip.next();
      int n = s.length()-1;
      String ans="";
      for(int i = 0;i<s.length();i++){
          char ch = s.charAt(i);
          int c = 1;
          if(i!=n){
           while(ch == s.charAt(i+1) && i<n){
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