abstract class  Aeroplane1 {

    // jin methods ke body nhi hote and child class me as overriden kar diye jate as per requirement
    // this type of methods ko hm abstract methods kahte hai

    // And jis class me yak bhi anstract method hai usko hm abstract class bol dete hai
   abstract public void takeOff();

   abstract public void fly();
}

class CargoPlane extends Aeroplane1 {
    public void takeOff() {
        System.out.println("CargoPlane require longer runway");
    }

    public void fly() {
        System.out.println("CargoPlane flies at lower height");
    }
}

class PassengerPlane extends Aeroplane1 {
    public void takeOff() {
        System.out.println("PassengerPlane require medium size runway");
    }

    public void fly() {
        System.out.println("PassengerPlane flies at medium height");
    }
}

class FighterPlane extends Aeroplane1 {
    public void takeOff() {
        System.out.println("FighterPlane require small size runway");
    }

    public void fly() {
        System.out.println("FighterPlane flies at higher height");
    }
}

public class AbstractionClassAndMethod {
    public static void main(String[] args) {
        Aeroplane1 cp = new CargoPlane();
        cp.takeOff();
        cp.fly();

        Aeroplane1 pp = new PassengerPlane();
        pp.takeOff();
        pp.fly();

        Aeroplane1 fp = new FighterPlane();
        fp.takeOff();
        fp.fly();
        
    }
}
