import java.util.*;

public class ChangeCasesOfCharacter {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        String s = ip.nextLine();
        StringBuffer ans = new StringBuffer("");
        for(int i = 0;i<s.length();i++){
            if(Character.isLowerCase(s.charAt(i))){
                ans.append(Character.toUpperCase(s.charAt(i)));
            }
            else{
                ans.append(Character.toLowerCase(s.charAt(i)));
            }
        }

        System.out.println(ans);
    }
}
