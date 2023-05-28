import java.util.*;
import java.util.HashMap;
public class RemoveDuplicatesFromJava {
    public static void main(String[] args) {
        // This will give us sorted String
        String s = "aababcd";
        char arr[] = s.toCharArray();
         HashSet<Character>st = new LinkedHashSet<>();
         for(char c:arr){
            st.add(c);
         }
         String l = "";
         for(char p:st){
            l+=p;
         }
         System.out.println(l);

         // But if we want unSorted String Like as input String Order(Order does not distrub)
         char ch[] = s.toCharArray();
         int n = s.length();
         System.out.println(removeDuplicates(ch,n)); 

    }

    public static char[] removeDuplicates(char ch[],int n){
                   
        String ans="";
        HashMap<Character,Integer>mpp = new HashMap<>();
        for (int i = 0; i < ch.length; i++) {
            if(!mpp.containsKey(ch[i])){
                ans+=ch[i];
                mpp.put(ch[i],1);
            }
        }
        return ans.toCharArray();
    }
}
