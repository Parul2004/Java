import java.util.*;

public class SetEQuestion {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        String s = ip.next();
        
        String f = "";
        int n = ip.nextInt();
        while(n!=0){
            String c1 = ip.next();
            f+=c1;
            n--;
        }

        HashMap<Character,Integer> h = new HashMap<>();

        for(int i = 0;i<s.length();i++){
            if(h.containsKey(s.charAt(i))){
                int c = h.get(s.charAt(i));
                h.put(s.charAt(i),c+1);
            }
            else{
                h.put(s.charAt(i),1);
            }
        }
        int sum = 0;
        for(int i = 0;i<f.length();i++){
            if(h.containsKey(f.charAt(i))){
                int b = f.charAt(i);
                int l = h.get(f.charAt(i));
                sum+=(b*l);
            }
        }
        System.out.println(sum);
    }
}
