public class StringMethods {
    public static void main(String[] args) {
        String str1 = "GeeksForGeeks";
        // this will return length of string
        System.out.println(str1.length());
        // this will return substring of string
        // return substring from i to j-1 index
        System.out.println(str1.substring(5, 8));
        // return substring from i to end
        System.out.println(str1.substring(5));
        // this will return character at given index
        System.out.println(str1.charAt(0));
        // concatination of 2 string
        String str2 = "Geeks";
        String str3 = "ForGeeks";
        String output = str2.concat(str3);
        System.out.println(output);

        // returns the index within the string of the first occurrence of the specified string
        String learn = "Let's Learn And Share Learn";
        System.out.println(learn.indexOf('d'));

        // returns the index within the string of the last occurrence of the specified string
        System.out.println(learn.lastIndexOf('L'));

        // compares the string to the specified object
        boolean com1 = "Geeks".equals(str2);
        boolean com2 = "Geeks".equals(str3);
        System.out.println(com1);
        System.out.println(com2);

        // String1.equalsIgnoreCase(String2)
        boolean com3 = "geeks".equals(str2);
        boolean com4 = "geeks".equalsIgnoreCase("Geeks");
        System.out.println(com3);
        System.out.println(com4);

        // compare two string lexicographically
        String s1 = "c";
        String s2 = "b";
        int out1 = s1.compareTo(s2);
        int out2 = s1.compareToIgnoreCase(s2);
        System.out.println(out1);
        System.out.println(out2);

        // out < 0  it means s1 commes before s2
        // out = 0 it means s1 and s2 are equal
        // out > 0 it means s1 comes after s2

        // LowerCase 
        String name = "PARUL";
        System.out.println(name.toLowerCase());

        // upperCase
        String surName = "sura";
        System.out.println(surName.toUpperCase());

        // String.trim():- returns the copy of the String, by removing
        // whiteSpaces at both ends. 
        // ***** It does not affect whiteSpaces in the middle  *****

        String trimString = "                 Learn Share Learn          ";
        System.out.println(trimString.trim());

        // returns new String by replacing all occurrences
        // of oldChar with newChar
        System.out.println(trimString.replace('L', 'P').trim());





    


    }
}
