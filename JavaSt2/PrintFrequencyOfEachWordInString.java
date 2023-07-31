import java.util.*;

public class PrintFrequencyOfEachWordInString {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        String str = ip.nextLine();

        str = str.toLowerCase();
        String arr[] = str.split(" ");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        HashMap<String, Integer> m = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            if (m.containsKey(arr[i])) {

                int c = m.get(arr[i]);
                m.put(arr[i], c + 1);
            } else {
                if (arr[i] == "." || arr[i] == "?" || arr[i] == "*" || arr[i] == "&" || arr[i] == "$"
                        || arr[i] == "!") {
                    continue;
                } else {
                    m.put(arr[i], 1);
                }

            }
        }

        System.out.println("Number of Words are " + arr.length);
        System.out.println("Words Frequency is : ");

        for(HashMap.Entry<String,Integer> entry : m.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}
