class RunnableDemo implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread: " + Thread.currentThread().threadId() + ", getState(): " + Thread.currentThread().getState());
    }
}

public class RunnableInterface {
    public static void main(String[] args) {
        System.out.println("RunnableInterface start...");
        for (int i = 0; i < 8; i++) {
            Thread object = new Thread(new RunnableDemo());
            object.start();
        }
        System.out.println("RunnableInterface end...");
    }
}
