interface Workable {
    public void work();
}

interface Eatable {
    public void eat();
}

class Tester implements Eatable, Workable {

    @Override
    public void eat() {
        System.out.println("Tester is eating...");
    }

    @Override
    public void work() {
        System.out.println("Tester is prepare RN...");
    }
}

class Robots implements Workable {

    @Override
    public void work() {
        System.out.println("Robots is running...");
    }
}

public class IspPrinciple {
    public static void main(String[] args) {
        Workable tester = new Tester();
        tester.work();
        Eatable eatable = (Eatable) tester;
        eatable.eat();
        Workable robot = new Robots();
        robot.work();
    }
}
