public class NormalInterface {
    public static void main(String[] args) {
        TestClass testClass = new TestClass();
        testClass.Printing();
        testClass.display();
    }
}

class TestClass implements TestInterface {

    @Override
    public void Printing() {
        System.out.println("printing method...");
    }
}

interface TestInterface {
    void Printing();

    default void display() {
        System.out.println("default method...");
    }

    ;
}