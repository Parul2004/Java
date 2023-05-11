class Human1 {
    private String name;
    int age;

    Human1() {
        System.out.println("Human Class Constructor");
    }

    void sleep() {
        age = 18;
        name = "Parul";
        System.out.println("Human needs good sleep");
        System.out.println(age+" "+name);
    }
}

class Student1 extends Human1 {
    /*
     * publuc Student1(){
     * super() // here super keyword call to parent class constructor then it will
     * executed
     * // private members and parent class constructor will not participate or
     * inherited in child class
     * }
     * 
     */

    void display() {
        System.out.println("The age is : " + age);
        // System.out.println("The name is : " + name); name cann't be inherited because it is private data member
    }
}

public class Inheritance2 {
    public static void main(String[] args) {

        Student1 st = new Student1();
        st.sleep();
        st.display();
    }
}
