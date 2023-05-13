class OuterClass {
    public void show() {
        System.out.println("in show");
    }

    class InnerClassNonStatic {
        public void display() {
            System.out.println("in display");
        }
    }
}

class NonStaticInnerClass {
    public static void main(String[] qrgs) {
        OuterClass obj0 = new OuterClass();
        OuterClass.InnerClassNonStatic obj1 = obj0.new InnerClassNonStatic();
        obj0.show();
        obj1.display();


    }
}