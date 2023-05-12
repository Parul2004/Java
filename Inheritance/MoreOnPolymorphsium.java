class Aeroplane1 {
    public void takeOff() {
        System.out.println("Aeroplane is taking off");
    }

    public void fly() {
        System.out.println("Aeroplane is Flying");
    }
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
        System.out.println("PassengerPlane require small size runway");
    }

    public void fly() {
        System.out.println("PassengerPlane flies at higher height");
    }
}

class Airport {
    public void ploy(Aeroplane1 ref) {
        ref.takeOff();
        ref.fly();

        System.out.println("-----------------------------------------------------");
    }
}

public class MoreOnPolymorphsium {
    public static void main(String[] args) {
        CargoPlane cp = new CargoPlane();

        PassengerPlane pp = new PassengerPlane();

        FighterPlane fp = new FighterPlane();

        Airport a = new Airport();
        a.ploy(cp);
        a.ploy(pp);
        a.ploy(fp);

    }
}
