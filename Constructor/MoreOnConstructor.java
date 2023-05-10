class Student {
    private int age;
    private String name;

    Student() {
        System.out.println("Zero Paramitrazied Constructor is Called");
    }

    Student(int age, String name) {
        this.age = age;
        this.name = name;
    }
    /*
     * 
     * int getAge() {
     * return age;
     * }
     * 
     * String getName() {
     * return name;
     * }
     * 
     */

    void display() {
        System.out.println(age + " " + name);
    }
}

public class MoreOnConstructor {
    public static void main(String[] args) {
        Student obj1 = new Student(18, "Parul");
        // int age1 = obj1.getAge();
        // String name1 = obj1.getName();
        // System.out.println(age1 + " " + name1);

        obj1.display();

        Student obj2 = new Student();
        
        // int age2 = obj2.getAge();
        // String name2 = obj2.getName();
        // System.out.println(age2 + " " + name2);

        obj2.display();

    }
}
