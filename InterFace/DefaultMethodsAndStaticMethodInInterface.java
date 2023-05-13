interface A {
    void show();

    default void abc() {
        System.out.println("my name is parul");
        // this is non-static method and need not to define in class
        // if we have defined any method in interface
        // non-static method need object to call it
    }

    static void parul() {
        // static method does not require object to call it
        System.out.println("today i am studing with happy mindset");
    }
}
class B implements A{
    public void show(){
        System.out.println("how are u mam ??");
    }
}
public class DefaultMethodsAndStaticMethodInInterface {
    public static void main(String[] args) {
        A.parul();
        A obj = new B();
        obj.abc();
        obj.show();
        
    }
}
