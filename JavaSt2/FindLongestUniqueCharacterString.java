import java.util.*;

public class FindLongestUniqueCharacterString {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        String s = ip.next();
        String ans="";
        int lenOfAns = 0;
        for(int i = 0;i<s.length();i++){
            for(int j = i+1;j<=s.length();j++){
                String sub = s.substring(i, j);
                boolean flag = checkUnique(sub);
                if(flag == true && sub.length()>lenOfAns){
                      ans = sub;
                    //  System.out.println(ans);
                      lenOfAns = sub.length();
                }
            }
        }
        System.out.println("Unique character String is : "+ans);
        System.out.println("Length of String is : "+lenOfAns);
    }

    public static boolean checkUnique(String sub){
        HashMap<Character,Integer> m = new HashMap<>();

        for(int i = 0;i<sub.length();i++){
            if(m.containsKey(sub.charAt(i))){
                return false;
            }
            else{
                m.put(sub.charAt(i),1);
            }
        }

        return true;
    }
}
