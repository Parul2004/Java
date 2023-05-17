import java.util.Scanner;

public class FindTheLongestBalancedSubstringOfBinaryString {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        String str = ip.next();
        int n = str.length();
        int maxi = 0;
        for(int i = 0;i<n;i++){
            for(int j = i+1;j<=n;j++){
                String sub = str.substring(i, j);
                int sublen = sub.length();

                Boolean flag = checkBal(sub);
                if(flag == true){
                     if(maxi<sublen){
                        maxi = sublen;
                     }
                }
            }
        }
        System.out.println(maxi);
    }
     public static boolean checkBal(String str){
            int countZero = 0,countOne = 0;

            for(int i = 0;i<str.length();i++){
                if(str.charAt(i) == '0'){
                    countZero++;
                }
                else if(str.charAt(i) == '1'){
                    countOne++;
                }
                else{
                    break;
                }
            }
            if(countOne == countZero) return true;
            return false;
     }

}
