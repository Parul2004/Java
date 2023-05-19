import java.util.Scanner;

public class LongestKUniqueCharacterSubstrings {
    public static void main(String[] args) {

        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();
       
        for (int i = 0; i < t; i++) {
            String str = ip.next();
            int k = ip.nextInt();
// ans = ans + Integer.toString(c+1);
            if (k > str.length())
                System.out.println(-1);
            else {
                int maxi = -1;
                for (int l = 0; l < str.length(); l++) {
                    for (int j = l + 1; j < str.length() + 1; j++) {
                        boolean f = check((str.substring(l, j)),k);
                     //   System.out.println("Value of Substring is "+f+"\n");
                        int subStringLen = str.substring(l, j).length();
                        if (f == true && subStringLen > maxi) {
                            maxi = subStringLen;
                        }
                    }
                }
               // System.out.println("Value of maxi is : ");
                System.out.println(maxi);
               // System.out.println();
            }

        }

    }

    public static boolean check(String str,int k) {
        int freq[] = new int[26];
        for(int i = 0;i<26;i++){
            freq[i] = 0;
        }
        for (int i = 0; i < str.length(); i++) {
                freq[str.charAt(i)-'a']++;
        }
        // System.out.println("\nFreq array is : ");
        // for(int i = 0;i<26;i++){
        //     System.out.print(freq[i]+" ");
        // }
        int count = 0;
        for(int i = 0;i<26;i++){
            if(freq[i] > 0){
                    count+=1;
            }
        }
      //  System.out.println("Count is : "+count+"\n");
        if(count == k) return true;
        return false;
    }
}
