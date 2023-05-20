import java.util.Scanner;

public class ReverseWordsInGivenString {
    public static void main(String[] args) {
        Scanner ip  = new Scanner(System.in);
        String str = ip.nextLine();

        int l = str.length();

        StringBuilder ans=new StringBuilder("");
        StringBuilder tmp=new StringBuilder("");
       
        for(int i = l-1;i>=0;i--){
            if(str.charAt(i) == ' '){
                tmp.reverse();
                ans.append(tmp);
                ans.append(" ");
                tmp.delete(0, tmp.length());
            }
            else{
                tmp.append(str.charAt(i));
            }
        }

        tmp.reverse();
        ans.append(tmp);
        System.out.println(ans);
    }
}
