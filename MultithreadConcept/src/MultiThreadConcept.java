public class MultiThreadConcept {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            try {
                Thread.sleep(1001);
            } catch (Exception e) {
                System.out.println("e: " + e.getMessage() + " " + e);
            }
            System.out.println("Thread is running...");
        }
        );

        System.out.println("t1: " + t1.threadId() + ", state: " + t1.getState());
        t1.start();
        System.out.println("t1: " + t1.threadId() + ", state: " + t1.getState());
        try {
            Thread.sleep(500);
            System.out.println("t1: " + t1.threadId() + ", state: " + t1.getState());
            t1.join();
            System.out.println("t1: " + t1.threadId() + ", state: " + t1.getState());

        } catch (InterruptedException e) {
            //System.out.println();
            e.printStackTrace();
        }
    }
}
