import java.util.Scanner;

public class LongestKUniqueCharacterSubstrings {
    public static void main(String[] args) {

        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();
        int maxi = 0;
        for (int i = 0; i < t; i++) {
            String str = ip.next();
            int k = ip.nextInt();

            if (k > str.length())
                System.out.println(-1);
            else {
                for (int l = 0; l < str.length(); l++) {
                    for (int j = l+1; j < str.length() + 1; j++) {
                        boolean f = check(str.substring(l, j));
                        int subStringLen = str.substring(l, j).length();
                        if (f == true && subStringLen==k) {
                           
                            maxi+=1;
                        }
                        else{
                            break;
                        }
                    }
                }
                System.out.println(maxi);
            }
           
        }


    }

    public static boolean check(String str) {
             for(int i = 0;i<str.length();i++){
                for(int j = i+1;j<str.length();j++){
                    if(str.charAt(i) != str.charAt(j)){
                        continue;
                    }
                    else{
                        return false;
                    }
                }
             }
             return true;
    }
}
