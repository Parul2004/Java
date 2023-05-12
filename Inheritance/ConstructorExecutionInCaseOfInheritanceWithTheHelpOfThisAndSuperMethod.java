class Demo1 {
    int a, b;

    public Demo1() {
        // then it will react here with 0 paramitrised constructor
        // if u want that by default it should go to paramitrized u can 
        // write arguments inside super method
        
        System.out.println("Parent class Constructor");
    }

    public Demo1(int x, int y) {
        System.out.println("Parameterized Parent Class constructor");
        a = x;
        b = y;
    }
}

class Demo2 extends Demo1 {
    int m, n;

    public Demo2() {
        this(10, 20);
        // this method goes to demo2 class having paramitrized constructor 
        System.out.println("Child Class Constructor");
    }

    public Demo2(int x,int y){

        // after coming to it
        // super method by default is invoked and goes to parent class constructor

        System.out.println("Parameterized child class Constructor");
        m = x;
        n = y;
    }
}

public class ConstructorExecutionInCaseOfInheritanceWithTheHelpOfThisAndSuperMethod {
    public static void main(String[] args) {
        
        Demo2 d = new Demo2();
    }
}
