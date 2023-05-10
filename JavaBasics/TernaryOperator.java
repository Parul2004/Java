public class TernaryOperator{
    public static void main(String[] args) {
        int a = 3;
        int b = 21;
        int c = 1;

       // int result = (a<b)?((a<c?a:c)):(b<c?b:c); 
        int result = (a<b)?((a<c?a:c)):(b<c?b:c); 

        if(a<b && a<c){
         // a < c
                System.out.println(a);
            
        }
        else if(b<c){
            System.out.println(b);
        }
        else{
            System.out.println(c);
        }
       // System.out.println(result);

       
 
    }
}