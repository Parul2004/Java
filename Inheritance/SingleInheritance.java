class Animal{
   void sleep(){
    System.out.println("Animal needs Sleep");
   }
}

class Tiger extends Animal{

}

class SingleInheritance{
    public static void main(String[] args) {
        Tiger obj = new Tiger();
        obj.sleep();
    }
}