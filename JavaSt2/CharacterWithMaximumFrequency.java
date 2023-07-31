import java.util.*;

public class CharacterWithMaximumFrequency {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        HashMap<Character,Integer> m = new HashMap<>();

        String s = ip.next();
        for(int i = 0;i<s.length();i++){
                
            if(m.containsKey(s.charAt(i))){
                 int c = m.get(s.charAt(i));
                 m.put(s.charAt(i), c+1);
            }
            else{
                m.put(s.charAt(i), 1);
            }
        }


        int q = -1;
        char ch = ' ';
        for(int i = 0;i<s.length();i++){
                if(q<m.get(s.charAt(i))){
                        q = m.get(s.charAt(i));
                        ch = s.charAt(i);
                }
        }
        System.out.println("Character is : "+ch+" its freQuency is : "+q);
    }
}
