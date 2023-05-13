class NonStaticOuter{
    public void show(){
        System.out.println("hello show");
    }
    static class StaticInner{
        public void display(){
            System.out.println("hello display");
        }
    }
}
public class StaticInnerClass {
    public static void main(String[] args) {
        NonStaticOuter obj0 = new NonStaticOuter();
        NonStaticOuter.StaticInner obj1 = new NonStaticOuter.StaticInner();
        obj0.show();
        obj1.display();

    }
}
