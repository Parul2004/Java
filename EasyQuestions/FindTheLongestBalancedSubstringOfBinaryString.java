import java.util.Scanner;

public class FindTheLongestBalancedSubstringOfBinaryString {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        String str = ip.next();
        // 01000111
        int len = str.length();
        int answer = 0,start = 0;

        while(start<len){
            int countZeroes = 0;
            while(start<len && str.charAt(start) == '0'){
                start++;
                countZeroes++;
            }
            int countOnes = 0;
            while(start<len && str.charAt(start) == '1'){
                start++;
                countOnes++;
            }

            answer = Math.max(answer,2*Math.min(countOnes,countZeroes));
        }

        System.out.println(answer);
    }
}
