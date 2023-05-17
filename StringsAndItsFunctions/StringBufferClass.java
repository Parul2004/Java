public class StringBufferClass {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("");
        // we have to convert StringBuffer and StringBuider to String before printing
        System.out.println(str);
        System.out.println(str.length());
        System.out.println(str.capacity());

        str.append("parulSura");
        str.append(" ");
        str.append("World's");
        System.out.println(str.length());
        System.out.println(str.capacity());

        String subStr = str.toString();
        System.out.println(subStr);


        // insert method will insert the given
        // string to specified position

        StringBuffer sb = new StringBuffer("hello World");
        sb.insert(5,"java ");
        System.out.println(sb);

        // replace 
        // this replace method replaces the given string from the
        // specifeid beginIndex to endIndex-1;

        sb.replace(1, 5, "");
        System.out.println(sb);


        // delete method of the StringBuffer class
        // deletes the string from specified beginIndex to endIndex-1;

        sb.delete(5, 11);
        System.out.println(sb);

        // reverse method will reverse the current string
        sb.reverse();
        System.out.println(sb);

        // capacity method
        System.out.println(sb.capacity());
    }
}
