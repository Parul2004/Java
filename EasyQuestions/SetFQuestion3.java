import java.util.*;

public class SetFQuestion3 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int num1 = ip.nextInt();
        int num2 = ip.nextInt();
        int num3 = ip.nextInt();

        int ones[] = new int[3];
        int tens[] = new int[3];
        int hun[] = new int[3];
        int thous[] = new int[3];
      //  int ans[] = new int[4];

        arraySendinf(ones, tens, hun, thous,num1,num2,num3);
        
        Arrays.sort(ones);
        Arrays.sort(tens);
        Arrays.sort(hun);
        Arrays.sort(thous);

       System.out.println(thous[0]+""+hun[2]+""+tens[0]+""+ones[2]);
       
        

    }

    public static void arraySendinf(int ones[],int tens[],int hun[],int thous[],int num1,int num2,int num3){
        int i = 0;
        while(num1!=0 && num2!=0 && num3!=0){
           
            if(i==0){
                int j = 0;
               ones[j++] = num1%10;
               ones[j++] = num2%10;
               ones[j++] = num3%10;
            }
            else if(i==1){
                int j = 0;
                tens[j++] = num1%10;
                tens[j++] = num2%10;
                tens[j++] = num3%10;
            }
            else if(i==2){
                int j = 0;
                hun[j++] = num1%10;
                hun[j++] = num2%10;
                hun[j++] = num3%10;
            }
            else if(i==3){
                int j = 0;
                thous[j++] = num1%10;
                thous[j++] = num2%10;
                thous[j++] = num3%10;
            }
            num1/=10;
            num2/=10;
            num3/=10;
            i++;
        }
    }

   
}
