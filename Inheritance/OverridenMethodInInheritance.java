
class AeroPlane {
    public void takeOff() {
        System.out.println("AeroPlane is taking off");
    }

    public void fly() {
        System.out.println("AeroPlane is flying");
    }

}

class CargoPlane extends AeroPlane {

    public void fly() {
        System.out.println("CargoPlane is flying");
    }
}

class PassengerPlane extends AeroPlane {
    public void fly() {
        System.out.println("PassengerPlane is flying");
    }
}

public class OverridenMethodInInheritance {

    public static void main(String[] args) {

        // here fly() methods are overriden
        // in Parent class fly() method is called overriden
        // and in Child Class fly() method is called overriding

        System.out.println("***  This is in CargoPlane ***");
        CargoPlane cp = new CargoPlane();
        cp.fly();
        cp.takeOff();

        System.out.println("*** This is in PassengerPlane ***");
        PassengerPlane pp = new PassengerPlane();
        pp.fly();
        pp.takeOff();
    }
}
