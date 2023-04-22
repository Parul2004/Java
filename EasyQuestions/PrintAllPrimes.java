import java.util.*;

public class PrintAllPrimes {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        int n = ip.nextInt();

        printAllprimes(n);
    }

    public static void printAllprimes(int n) {
        
            
          
            for (int i = 2; i <= n; i++) {
                int f = 1;
                for (int j = 2; j <i; j++) {
                          if(i%j == 0){
                            f = 0;
                            break;

                          }
                }
              
                if(f == 1){
                    System.out.println(i);
                }
            }
        

    }
}
