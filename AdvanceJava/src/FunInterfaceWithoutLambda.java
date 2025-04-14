public class FunInterfaceWithoutLambda {
    public static void main(String[] args) {
        TestFunInterface testFunInterface = new TestFunInterface() {
            @Override
            public void display(int a) {
                System.out.println("display...." + a);
            }
        };
        testFunInterface.display(23);
    }
}

@FunctionalInterface
interface TestFunInterface {
    void display(int a);
}