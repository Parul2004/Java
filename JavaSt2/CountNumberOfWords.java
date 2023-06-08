import java.util.*;
public class CountNumberOfWords {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        String s = ip.nextLine();
        if(s.length() == 0){
            System.out.println(0);
        }
        else{
            int c = 1;
            for(int i = 0;i<s.length();i++){
                 if(s.charAt(i) == ' '){
                    c++;
                 }
            }
            System.out.println("Number of Words are : "+c);
            int a = s.charAt(0);
            System.out.print(s.charAt(0)+" "+ a+" ");
            for(int i = 0;i<s.length();i++){
                if(s.charAt(i) == ' '){
                    a = s.charAt(i+1);
                    System.out.print(s.charAt(i+1)+" "+a+" ");
                }
            }
        }
    }
}
