class Student {
    private int age;
    private String name;

    Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    /*
     * void setAge(int age) {
     * this.age = age;
     * }
     * 
     * void setName(String name) {
     * this.name = name;
     * }
     */

    int getAge() {
        return age;
    }

    String getName() {
        return name;
    }

}

class ConstructorBasics {
    public static void main(String[] args) {
        Student s1 = new Student(18, "Parul");

        // s1.setAge(19);
        // s1.setName("Parul");

        int age = s1.getAge();
        String name = s1.getName();

        System.out.println(age + " " + name);
    }
}