
interface Computer {
    public void compileCode();
}

class Laptop implements Computer {
    public void compileCode() {
        System.out.println("You got 3 errors !!!");
    }
}

class Dekstop implements Computer {
    public void compileCode() {
        System.out.println("You got 3 errors !!!, faster");
    }
}

class Developer {
    public void buildApp(Computer obj) {
        System.out.println("Building App");
        obj.compileCode();
    }
}

public class MoreOnInterfaceOrReplaceMentOfAbstractClass {
    public static void main(String[] args) {
        Computer obj = new Dekstop();
        Developer dev = new Developer();
        dev.buildApp(obj);
    }
}
