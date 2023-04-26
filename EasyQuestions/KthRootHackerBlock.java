import java.util.*;
public class KthRootHackerBlock {
       public static void main(String[] args) {
             Scanner ip = new Scanner(System.in);
             int t = ip.nextInt();

             for(int i = 0;i<t;i++){

      
                Long  n = ip.nextLong();
                Long k = ip.nextLong();

                Long  s = 1L,e  = n;
                long ans = 0;

                while (s<=e) {
                    long mid = (s+e)/2;
                    if(is_Answer(n,k,mid)){
                        ans = mid;
                        s = mid+1;
                    }
                    else{
                        e = mid-1;
                    }
                }
                System.out.println(ans);
             }
             
       }
     public  static  boolean is_Answer(long n,long k,long ans){
        if(Math.pow(ans,k)<=n) return true;
        return false;
       }
}
