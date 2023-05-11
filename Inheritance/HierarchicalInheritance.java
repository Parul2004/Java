class Animal { // extends Object Class
    void sleep() {
        System.out.println("Animal needs sleep");
    }
}

class Tiger extends Animal { 

}

class Monkey extends Animal {

}

class Cat extends Animal {

}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        
        Cat obj1 = new Cat();
        obj1.sleep();

        Tiger obj2 = new Tiger();
        obj2.sleep();

        Monkey obj3 = new Monkey();
        obj3.sleep();
    }
}
