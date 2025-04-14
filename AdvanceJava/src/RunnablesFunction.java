
public class RunnablesFunction {
    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println("Runnable interface called...");
        Thread thread = new Thread(runnable);
        thread.start();
        Thread thread1 = new Thread(() -> System.out.println("runnale interface called...now.."));
        thread1.start();
    }
}
