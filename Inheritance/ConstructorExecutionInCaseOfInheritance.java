class Demo1{
    int a,b;
        public Demo1(){
            System.out.println("Parent Class Constructor");
        }

        public Demo1(int x,int y){
            System.out.println("Paramiterized Parent Class Constructor");
        }
}

class Demo2 extends Demo1 {
     int m,n;
     public Demo2(){
        // here by default 0 paramitrised constructor is invoked
        // super();

        // But if I wnat ke paramitrized constructor call ho parent class ka
        // then I have to pass paramter with super keyword

        super(10,30);
        System.out.println("Child Class Constructor");
     }

     public Demo2(int x,int y){
        // here by default 0 paramitrised constructor is invoked
        super();

        // But if I wnat ke paramitrized constructor call ho parent class ka
        // then I have to pass paramter with super keyword

        System.out.println("Paramiterized Child Class Constructor");
     }
}
public class ConstructorExecutionInCaseOfInheritance {
    public static void main(String[] args) {
        Demo2 obj1 = new Demo2();
        Demo2 obj2 = new Demo2(10,30);
        
    }
}
