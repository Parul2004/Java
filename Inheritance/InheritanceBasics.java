
class Human { // Base Class, Parent Class, Super Class
    int age;

    void sleep() {
        age = 18;
        System.out.println("Human needs good sleep");
        System.out.println(age);
    }
}

class Student extends Human { // Child Class, Derived Class,Sub Class

}

class InheritanceBasics {
    public static void main(String[] args) {
        Student st = new Student();
        st.sleep();
    }
}