import java.util.*;

public class KartikBhaiyaByMuskanGupta {

    public static void main(String args[]) {


        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        int k = Integer.parseInt(st);
        String str = sc.next();
        int max = 0;
        int a = 0;
        int b = 0;
        int left = 0;
        int right = 0;
        while (right < str.length()) {
            if (str.charAt(right) == 'a') {
                a++;
            } else {
                b++;
            }
            while (true) {
                if (a > k && b > k) {
                    if (str.charAt(left) == 'a') {
                        a--;
                    } else {
                        b--;
                    }
                    left++;
                } 
                else {
                    break;
                }
            }

            max = Math.max(max, right - left + 1);
            right++;
        }

        System.out.print(max);

        /*


         * public static int calc(String st){
         * int cnt=0;
         * for(int i=0; i< st.length(); i++){
         * if(st.charAt(i)=='a'){
         * cnt++;
         * }
         * }
         * return cnt;
         * }
         * for( int i=0; i< str.length();i++){
         * for( int j=i+1; j<=str.length(); j++){
         * String curr= str.substring(i,j);
         * int a=calc(curr);
         * int b=curr.length()-a;
         * if(a<=k || b<=k){
         * max=Math.max(curr.length(),max);
         * }
         * }
         *  }
         * 
         * 
         */
    }
}