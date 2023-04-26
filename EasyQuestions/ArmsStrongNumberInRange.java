import java.util.*;

public class ArmsStrongNumberInRange {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int a = ip.nextInt();
        int b = ip.nextInt();

        printRange(a, b);
    }

    public static int isArm(int i) {
       int c = 0,m = i,l = i;
       while (m!=0) {
        c++;
        m/=10;
       }

       int s = 0,a=0;

       while (i!=0) {
        a = i%10;
       
        s = s+(int)Math.pow(a, c);
        i/=10;
       }

       if(l==s) return 1;
       else return 0;
    }

    public static void printRange(int a,int b) {
        for(int i = a;i<=b;i++){
            int k = isArm(i);
            if(k == 1){
                System.out.println(i);
            }
            else{
                continue;
            }

        }
    }
}
