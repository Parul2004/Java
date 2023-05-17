public class StringsBasic{
    public static void main(String[] args) {
        String str1 = "geeks";
        System.out.println(str1);
        String str2 = new String("example");
        System.out.println(str2);

        StringBuffer str3 = new StringBuffer("parul sura");
        System.out.println(str3);

        StringBuilder str4 = new StringBuilder("my name is kinmeen");
        System.out.println(str4);

        String str5 = "lucky";
        str5 = str5.concat(" sura");
        System.out.println(str5);


        char ch[] = {'p','a','r','u','l'};
     
        String str6 = new String(ch);
        System.out.println(str6);

        // i think this will give address of char array
        String str7 = ch.toString();
        System.out.println(str7);

        /*
         * 
         * What are Strings in Java?
         * 
         * Strings are the types of objects which can store charachters as elements
         * 
         * Why string objects are immutable in Java?
         * 
         * Because java uses the concept of string literal.
         * Suppose ther eare 5 reference variables,all refer to one
         * object "Parul".If one reference variable changes the value of 
         * the object,it will affected by all the reference variables.
         * That is why string objects are immutable in java
         * 
         * Why Java uses the concept of string literal?
         * To make Java more memory efficient
         * (because no new objects are created if it exists already in the string constant pool)
         */



    }
}