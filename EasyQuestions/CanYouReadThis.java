import java.util.*;
public class CanYouReadThis {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

     String st = ip.next();
	 int n = st.length();
     String ans = "";
	 for(int i = 0;i<n;i++){
		 if(i!=0 && ((st.charAt(i-1) >= 'A' && st.charAt(i-1)<='Z') || (st.charAt(i-1) >= 'a' && st.charAt(i-1)<='z')) && (st.charAt(i) >= 'A' && st.charAt(i)<='Z')){
             System.out.println(ans);
			 ans="";
         
			 ans+=st.charAt(i);
             
		 }
		 else{
       
             ans+=st.charAt(i);
             
		 }
	 }
	 System.out.println(ans);
    }
}
