interface A {
    void show();
    public void parul();
}

class B implements A,X {

    public void show() {
        System.out.println("I am in class A");
    }
    public void parul(){
        System.out.println("my name is parul");
    }
    public void abc(){
        System.out.println("i will do all coding problems");
    }
}
interface X{
    void abc();
}
public class ImplementationOfInterface {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
        obj.parul();
        obj.abc();
    }
}
