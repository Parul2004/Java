class AeroPlane {
    public void takeOff() {
        System.out.println("Aeroplane is taking Off");
    }

    public void fly() {
        System.out.println("Aeroplane is flying");
    }
}

class CargoPlane extends AeroPlane {
    public void takeOff() {
        System.out.println("CargoPlane require longer runway");
    }

    public void fly() {
        System.out.println("CargoPlane flies at lower height");
    }
}

class PassengerPlane extends AeroPlane {
    public void takeOff() {
        System.out.println("PassengerPlane require medium size runway");
    }

    public void fly() {
        System.out.println("PassengerPlane flies at medium height");
    }
}

public class IntroductionToPolymorphsim {
    public static void main(String[] args) {
        CargoPlane cp = new CargoPlane();

        // cp.takeOff();
        // cp.fly();


        System.out.println("***************-------------------********************");
        PassengerPlane pp = new PassengerPlane();


        AeroPlane ref;

        ref = cp;
        ref.takeOff();
        ref.fly();

        ref = pp;
        ref.takeOff();
        ref.fly();
        // pp.takeOff();
        // pp.fly();
    }
}
