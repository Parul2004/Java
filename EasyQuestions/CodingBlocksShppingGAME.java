import java.util.*;

public class CodingBlocksShppingGAME {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();
        for(int i = 0;i<t;i++){
            int m = ip.nextInt();
            int n = ip.nextInt();
    
            whoWins(m,n);
        } 
    }

    public static void whoWins(int m,int n) {

        int a=0,h = 0,i=1;

        while (true) {
            a = a+i;
            if(a>m){
                System.out.println("Harshit");
                break;
            }
            i+=1;
            h = h+i;
            if(h>n){
                System.out.println("Aayush");
                break;
            }
            i+=1;
        }
        
    }
}
