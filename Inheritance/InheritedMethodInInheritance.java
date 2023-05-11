class AeroPlane {
    public void takeOff() {
        System.out.println("AeroPlane is taking off");
    }

    public void fly() {
        System.out.println("AeroPlane is flying");
    }

}

class CargoPlane extends AeroPlane {

}

class PassengerPlane extends AeroPlane {

}

public class InheritedMethodInInheritance {

    public static void main(String[] args) {

        // here all methods are inherited none of is modified

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
