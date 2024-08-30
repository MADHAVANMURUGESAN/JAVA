abstract class Base {
    void call() {
        System.out.println("Base call....");
    }

    abstract void method1();

    Base() {
        System.out.println("Base constructor....");
    }
}

class Derive extends Base {

    @Override
    void method1() {
        System.out.println("method1...");
    }
}

abstract class Sup {
    abstract void supCall();
}

class Sub extends Sup {

    @Override
    void supCall() {
        System.out.println("sub.supCall()....");
    }
}

public class AbstractConcept {
    public static void main(String[] args) {
        //base reference type
        Base base = new Derive();
        base.method1();
        base.call();

        //
        Base base1 = new Base() {
            @Override
            void method1() {
                System.out.println("main base");
            }
        };
        base1.call();

        //create
        //Sup sup = new Sup();
        Sup sup = new Sub();
        sup.supCall();
    }
}
