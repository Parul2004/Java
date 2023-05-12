import java.util.Scanner;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();
        for(int i = 0;i<t;i++){

            String ans = ip.next();
            System.out.println(ans);

             int arr[] = new int[256];

             for(int j = 0;j<256;j++){
                     arr[j] = -1;
             }

             for(int k = 0;k<ans.length();k++){
                if(arr[ans.charAt(k)] == -1){
                         arr[ans.charAt(k)] = k;
                }
                else{
                    arr[ans.charAt(k)] = -2;
                }
             }
             int mini = Integer.MAX_VALUE;

             for(int l = 0;l<256;l++){
                if(arr[l]>=0){
                    mini = Math.min(arr[l],mini);
                }
             }

            
             System.out.println(ans.charAt(mini));
        }
    }
}
