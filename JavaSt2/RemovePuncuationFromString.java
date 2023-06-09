import java.util.*;
public class RemovePuncuationFromString {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        String s = ip.next();
        String ans="";
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)>='a' && s.charAt(i)<='z' || (s.charAt(i)>='A' && s.charAt(i)<='Z')){
                ans+=s.charAt(i);
            }
        }
        System.out.println(ans);
    }
}
