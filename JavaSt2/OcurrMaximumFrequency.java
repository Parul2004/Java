import java.util.*;
public class OcurrMaximumFrequency {
    public static void main(String[] args) {
        
        Scanner ip = new Scanner(System.in);
        String s = ip.nextLine();

        int arr[] = new int[256];
        for(int i = 0;i<256;i++){
            arr[i] = 0;
        }

        for(int i = 0;i<s.length();i++){
            arr[s.charAt(i)]++;
        }
        int maxi = 0;
        for(int i = 0;i<256;i++){
            if(arr[i]>maxi){
                maxi = arr[i];
            }
        }

        System.out.println(maxi);

        for(int i = 0;i<256;i++){
            System.out.print(arr[i]+" ");
        }

        for(int i = 0;i<s.length();i++){
            if(arr[s.charAt(i)]==maxi){
                System.out.print(arr[s.charAt(i)]+" "+s.charAt(i));
                break;
            }
        }
    }
}
