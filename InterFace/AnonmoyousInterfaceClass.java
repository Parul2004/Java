interface A{
    public void parul();
}
public class AnonmoyousInterfaceClass {
    public static void main(String[] args) {
        A obj0 = new A() {
            public void parul(){
                // this is a class here, we can say a hidden class
                // with no "class" name
                System.out.println("hello my name is parul");
            }
        };
        obj0.parul();
    }
}
