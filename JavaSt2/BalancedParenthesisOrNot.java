import java.util.*;

public class BalancedParenthesisOrNot {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        String s = ip.next();
   
        System.out.println(checkBalance(s));
    
    }
    static public boolean checkBalance(String s){

        Stack<Character> t = new Stack<>();

        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);

            if(ch == '(' || ch == '[' || ch == '{'){
                t.push(ch);
            }
            else{
                if(t.isEmpty()){
                     return false;
                }

                else if((ch == ')' && t.peek() == '(')||(ch == ']' && t.peek() == '[')||(ch == '}' && t.peek() == '{')){
                       t.pop();
                }
                else{
                    return false;
                }
            }

           
        }
        return t.isEmpty();
    }
}
