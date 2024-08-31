interface Worker {
    public void eat();

    public void work();
}

class Developer implements Worker {

    @Override
    public void eat() {
        System.out.println("Developer is eating...");
    }

    @Override
    public void work() {
        System.out.println("Developer is working...");
    }
}

class Robot implements Worker {

    @Override
    public void eat() {
        //    throw new NotImplemented("Robot can't eat...")
    }

    @Override
    public void work() {
        System.out.println("Robot do a work...");
    }
}

public class IspViolationPrinciple {
    public static void main(String[] args) {
        Worker worker = new Developer();
        worker.eat();
        worker.work();
        worker = new Robot();
        worker.work();
        worker.eat();
    }
}
