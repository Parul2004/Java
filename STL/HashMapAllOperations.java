import java.util.ArrayList;
import java.util.HashMap;

public class HashMapAllOperations {
    public static void main(String[] args) {
        HashMap<String,Integer>mpp = new HashMap<>();
        mpp.put("Parul", 1007);
        mpp.put("Khyati",783);
        mpp.put("Muskan Aggarwal",901);
        mpp.put("Muskan Gupta",902);

        for(HashMap.Entry<String,Integer> entry:mpp.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

        System.out.println("Printing HashMap Elements : ");
        System.out.println(mpp);

        System.out.println("Size of Map is : ");
        System.out.println(mpp.size());

        System.out.println("Contains method() is : ");
        System.out.println(mpp.containsKey("Parul"));
        System.out.println(mpp.containsValue(901));

        // get method is used to receive method from the key
        System.out.println(mpp.get("Parul"));

        System.out.println("KeySet is : ");
        System.out.println(mpp.keySet());

        ArrayList<Integer>arr = new ArrayList<>(mpp.values());
        System.out.println(arr);

        System.out.println(arr.get(0));

        System.out.println("Is map empty ot not : ");
        System.out.println(mpp.isEmpty());


        System.out.println("Removing Element from Map : ");

        mpp.remove("Muskan Gupta");
        mpp.remove("Muskan Aggarwal");

        System.out.println(mpp);
    }
}
