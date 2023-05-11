class Parent1 { // extends Object Class
    int age = 18;
}

class Parent2 {
    int age = 19;
}

class Child extends Parent1 //, extends Parent2 
{
  // this is gnerate Ambiguity
  // Complier will confuse which age it should select 
  // Whether it is from Parent1 or Parent2

  // So multiple Inheritance is not possible 
  // it is possible with the help of interface

  /****   Multiple Inheritance is also called Dimond Shape Problem     ****/
}

public class MultipleInheritance {
    public static void main(String[] args) {

    }
}
