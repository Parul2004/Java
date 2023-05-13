interface A{
void show();
}
interface X{
void abc();
}
class Demo implements A,X{
public void show(){
    System.out.println("in show");
}

public void abc(){
    System.out.println("in abc");
}

}
public class BasicImplementationOfInterface {
    public static void main(String[] args) {
        
        A obj = new Demo();
        obj.show();
    }
}
