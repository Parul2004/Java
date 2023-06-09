import java.util.Scanner;

public class ConcateNateOddAndEvenIndex {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        String s = ip.next();

        StringBuffer s1 = new StringBuffer("");
        StringBuffer s2 = new StringBuffer("");
        StringBuffer ans = new StringBuffer("");
        for(int i = 0;i<s.length();i++){

            if(i%2==0){
                 s1.append(s.charAt(i));
            }
            else{
                s2.append(s.charAt(i));
            }
        }
        ans.append(s1);
        ans.append(s2);

        System.out.println(ans);
    }
}
