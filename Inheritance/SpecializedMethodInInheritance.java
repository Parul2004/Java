
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

    public void carryGoods(){
        System.out.println("CargoPlane carrt Goods");
    }
}

class PassengerPlane extends AeroPlane {
    public void fly() {
        System.out.println("PassengerPlane is flying");
    }

    public void carryPassenger(){
        System.out.println("PassengerPlane carry Passenger");
    }
}

public class SpecializedMethodInInheritance {

    public static void main(String[] args) {

        /*
         * Specialized Method are those method which are present only in Child Class not in Parent Class
         */

        System.out.println("***  This is in CargoPlane ***");
        CargoPlane cp = new CargoPlane();
        cp.fly();
        cp.takeOff();
        cp.carryGoods();

        System.out.println("*** This is in PassengerPlane ***");
        PassengerPlane pp = new PassengerPlane();
        pp.fly();
        pp.takeOff();
        pp.carryPassenger();
    }
}
