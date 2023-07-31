import java.util.*;

public class FindTheCharacterThatAreNotCommonIn2Strings {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        String s1 = ip.next();
        String s2 = ip.next();


        HashSet<Character> t1 = new HashSet<>();
        HashSet<Character> t2 = new HashSet<>();

        for(int i = 0;i<s1.length();i++){
            t1.add(s1.charAt(i));
        }
        for(int i = 0;i<s2.length();i++){
            t2.add(s2.charAt(i));
        }
        ArrayList<Character>arr = new ArrayList<>();

        for(int i = 0;i<s1.length();i++){
           if(!t2.contains(s1.charAt(i))){
               if(!arr.contains(s1.charAt(i))){
                arr.add(s1.charAt(i));
               }
           }
        }
        for(int i = 0;i<s2.length();i++){
           if(!t1.contains(s2.charAt(i))){
               if(!arr.contains(s2.charAt(i))){
                arr.add(s2.charAt(i));
               }
           }
        }

        if(arr.size() == 0){
            System.out.println("-1");
        }
        else{
            String ans="";
            Collections.sort(arr);
            for(char sh : arr){
                  ans+=sh;
            }
            System.out.println(ans);
        }
 
    }
}
