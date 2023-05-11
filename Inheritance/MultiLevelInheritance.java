class Animal { // extends Object Class

    /*
     * if any class doesn't extends any class then by default it will extends inbuilt Object Class 
     * and get access of objects members like equals and many more
     */
    void sleep() {
        System.out.println("Animal needs sleep");
    }
}

class Tiger extends Animal {

}

class Monkey extends Tiger {

}

class Cat extends Monkey {

}

public class MultiLevelInheritance {
    public static void main(String[] args) {

        Animal obj = new Animal();
        obj.equals(obj);

        Cat obj1 = new Cat();
        obj1.sleep();

        Tiger obj2 = new Tiger();
        obj2.sleep();

        Monkey obj3 = new Monkey();
        obj3.sleep();
    }
}
