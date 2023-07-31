import java.util.*;

public class SmithNumber {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        int k = n;

        int sum = 0;
        while(n!=0){
            sum+=(n%10);
            n/=10;
        }

        int sum1 = 0;
        while(k!=1){
            int p  = 0;
            for(int i = 2;i<=k;i++){
                if(k%i==0){
                    p = i;
                    k = k/i;
                    break;
                }
            }
            if(p>9){
                 while(p!=0){
                    sum1+=(p%10);
                    p/=10;
                 }
            }
            else{
                sum1+=p;
            }
        }

        if(sum == sum1){
            System.out.println("Smith Number");
        }
        else{
            System.out.println("Not Smith Number");
        }


        ArrayList<Integer>arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        // by default index is there in remove fucntion of ArrayList
        System.out.println(arr.remove(2));
        System.out.println(arr);
    }
}
