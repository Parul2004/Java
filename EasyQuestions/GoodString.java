import java.util.Scanner;

public class GoodString{
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        String st = ip.next();

        String ans="";
        String maxi="";
        for(int i = 0;i<st.length();i++){
            if(st.charAt(i) == 'a' || st.charAt(i) == 'e' || st.charAt(i) == 'i' || st.charAt(i) == 'o' || st.charAt(i) == 'u'
            || st.charAt(i) == 'A' || st.charAt(i) == 'E' || st.charAt(i) == 'I' || st.charAt(i) == 'O' || st.charAt(i) == 'U'){
                ans+=st.charAt(i);
                if(maxi.length() < ans.length()){
                    maxi = ans;
                }
                
            }
            else{
                ans="";
            }
        }
        System.out.println(maxi);
    }
}