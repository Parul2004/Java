class Student {
    private int age;
    private String name;

    void print() {
        System.out.println(age + " " + name);
    }

    void setAge(int age) {
        this.age = age;
    }

    void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

}

class EncapsulationBasics {
    public static void main(String[] args) {
        Student obj1 = new Student();

        // In detail I can read from my noteBook
        
        // obj1.age = 19;
        // obj1.name = "Parul";

        // i don't want ke ouside world se koi value assign kre

        obj1.setAge(19);
        obj1.setName("Parul");

        int age = obj1.getAge();
        String name = obj1.getName();

        System.out.println(age + " " + name);
       
       // obj1.print();

    }
}