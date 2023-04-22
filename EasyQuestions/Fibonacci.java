import java.util.*;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        int n = ip.nextInt();
         
        fibo(n);
    }
    public static void fibo(int n) {
        int a = 0;
        int b = 1;
        int c = 0;
     
      if(n == 1) {
        System.out.print(a);
      }
      else if(n==2){
        System.out.print(b);
      }
      else{
        for(int i = 0;i<n-1;i++){
            c = a+b;
            a = b;
            b = c;
        }

        System.out.println(c);
      }
        
    }
}
