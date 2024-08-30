public class FinallyConcept {
    public static void main(String[] args) {
        try {
            System.out.println("I am a try block...");
            int[] a = new int[3];
            int b = a[4];
        } catch (IllegalStateException e) {
            System.out.println("e: " + e);
        } /*catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("e: " + e);
        }*/ finally {
            System.out.println("I am finally block...");
        }
        //rest of program
        System.out.println("Rest of program executed..");
    }
}
