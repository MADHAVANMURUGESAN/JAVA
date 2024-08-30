class Demothread extends Thread {

    @Override
    public void run() {
        try {
            System.out.println("getName(): " + Thread.currentThread().getName() + ", threadId(): " + Thread.currentThread().threadId()+", getThreadGroup(): "+Thread.currentThread().getThreadGroup());
        } catch (Exception e) {
            System.out.println("e: " + e);
        }
    }
}

public class ThreadClass {
    public static void main(String[] args) {
        System.out.println("main class started...");
        for (int i = 0; i < 8; i++) {
            Demothread object = new Demothread();
            object.start();
        }
        System.out.println("main class ended...");
    }
}
