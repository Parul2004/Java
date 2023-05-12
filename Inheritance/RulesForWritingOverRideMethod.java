class Animal {
    public void eat() {
        System.out.println("Animal eats Everyday");
    }
}

class Tiger extends Animal {
    
    /*
     * 
     * We can't decrease visblity mode like above function mode
     * is public and then we remove it and changes into default
     * 
     * void eat(){
     * System.out.println("Tiger eats Everyday");
     * }
     */

    /*
     We cann't change the return type of function durng overriden
     * public int eat(){
     * System.out.println("Tiger eats Everyday");
     * }
     * 
     */

     // this function is not overRiden because here we are doing overloading
     // Parameters are different So not overRiden
     public void eat(int chapati){
        System.out.println("tiger eat "+chapati+"chapati");
     }
}

public class RulesForWritingOverRideMethod {
    public static void main(String[] args) {

    }
}
