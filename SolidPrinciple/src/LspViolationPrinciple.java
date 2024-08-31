abstract class Bird {
    public void fly() {
        System.out.println("Bird is flying...");
    }
}

class Sparrow extends Bird {
    @Override
    public void fly() {
        System.out.println("sparrow is flying...");
    }
}

class Penguin extends Bird {
    @Override
    public void fly() {
       // throw new NotImplemented("Penguin can't fly");
    }
}

public class LspViolationPrinciple {
    public static void main(String[] args) {
        Sparrow sparrow = new Sparrow();
        sparrow.fly();
        Penguin penguin = new Penguin();
        penguin.fly();
    }
}
